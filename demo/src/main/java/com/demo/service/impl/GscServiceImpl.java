package com.demo.service.impl;

import com.demo.dao.GscDao;
import com.demo.domain.GscEntity;
import com.demo.reponse.gsc.QueryGscPageResponse;
import com.demo.request.AddGscRequest;
import com.demo.request.QueryGscPageRequest;
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
}
