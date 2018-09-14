package com.demo.service.impl;

import com.demo.dao.GscDao;
import com.demo.domain.GscEntity;
import com.demo.reponse.gsc.QueryGscPageResponse;
import com.demo.request.AddGscRequest;
import com.demo.request.GscRequest;
import com.demo.request.QueryGscPageRequest;
import com.demo.request.UpdateGsc;
import com.demo.service.GscService;
import com.demo.util.DozerBeanMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class GscServiceImpl implements GscService {

    @Autowired
    private GscDao gscDao;
    /**
     * 新增
     * @param request
     * @throws Exception
     */
    @Override
    public void addNode(AddGscRequest request) throws Exception {
        GscEntity gscEntity = DozerBeanMapperUtil.dozerBeanMapper(request, GscEntity.class);
        gscEntity.setId(UUID.randomUUID().toString());
        gscEntity.setIsDeleted((byte) 0);
        gscDao.save(gscEntity);
    }

    /**
     * 分页获取GSC
     * @param request
     * @return
     */
    @Override
    public QueryGscPageResponse queryCloseEventGroup(QueryGscPageRequest request) throws Exception {
        int page = request.getPage();
        int size = request.getSize();

        List<Sort.Order> orders = new ArrayList<Sort.Order>();
        orders.add(new Sort.Order(Sort.Direction.ASC, "id"));
        Sort sort = new Sort(orders);
        Pageable pageable = new PageRequest(page, size, sort);
        Page<GscEntity> gsc = gscDao.findAll(QueryGscSpec.queryGscSpec(request), pageable);
        QueryGscPageResponse queryGscPageResponse = new QueryGscPageResponse();
        queryGscPageResponse.setPage(gsc.getNumber());
        queryGscPageResponse.setSize(gsc.getSize());
        queryGscPageResponse.setTotalElements(gsc.getTotalElements());
        queryGscPageResponse.setGscEntities(gsc.getContent());
        return queryGscPageResponse;
    }

    /**
     * 修改
     * @param request
     * @throws Exception
     */
    @Override
    public void updateNodePage(UpdateGsc request) throws Exception {
        GscEntity gscEntity = DozerBeanMapperUtil.dozerBeanMapper(request, GscEntity.class);
        gscDao.save(gscEntity);
    }

    /**
     * 删除
     * @param request
     * @throws Exception
     */
    public void deleteNode(GscRequest request) throws Exception {
        GscEntity one = gscDao.getOne(request.getGscGsnode());
        if (one != null && one.getIsDeleted() == 0) {
            one.setIsDeleted((byte) 1);
            gscDao.saveAndFlush(one);
        }
    }

    /**
     * 获取修改信息
     * @param request
     * @return
     * @throws Exception
     */
    public UpdateGsc queryGscByGscnode(GscRequest request) throws Exception {
        GscEntity one = gscDao.queryGesNode(request.getGscGsnode());
        if (one == null || one.getIsDeleted() == 1) {
            return null;
        }
        return DozerBeanMapperUtil.dozerBeanMapper(one, UpdateGsc.class);
    }
}
