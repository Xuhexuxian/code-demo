package com.demo.service;

import com.demo.reponse.gsc.QueryGscPageResponse;
import com.demo.request.AddGscRequest;
import com.demo.request.GscRequest;
import com.demo.request.QueryGscPageRequest;
import com.demo.request.UpdateGsc;

public interface GscService {

    /**
     * 新增
     * @param request
     * @throws Exception
     */
    void addNode(AddGscRequest request) throws Exception;

    /**
     * 分页获取GSC
     * @param request
     * @return
     * @throws Exception
     */
    QueryGscPageResponse queryCloseEventGroup(QueryGscPageRequest request) throws Exception;

    /**
     * 修改
     * @param request
     * @throws Exception
     */
    void updateNodePage(UpdateGsc request) throws Exception;

    /**
     * 删除
     * @param request
     * @throws Exception
     */
    void deleteNode(GscRequest request) throws Exception;

    /**
     * 获取修改信息
     * @param request
     * @return
     * @throws Exception
     */
    UpdateGsc queryGscByGscnode(GscRequest request) throws Exception;
}
