package com.demo.service;

import com.demo.reponse.gsc.QueryGscPageResponse;
import com.demo.request.AddGscRequest;
import com.demo.request.QueryGscPageRequest;

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
}
