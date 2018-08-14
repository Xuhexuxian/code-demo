package com.demo.controller;

import com.demo.reponse.ResponseVO;
import com.demo.reponse.gsc.QueryGscPageResponse;
import com.demo.request.AddGscRequest;
import com.demo.request.QueryGscPageRequest;
import com.demo.service.GscService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/gsc")
@Slf4j
public class GscController {

    @Autowired
    private GscService gscService;

    /**
     * 新增
     * @param request 新增对象
     * @return
     */
    @PostMapping(path = "/addNode")
    public ResponseVO addNode(@Valid @RequestBody AddGscRequest request) {
        ResponseVO responseVO = new ResponseVO();
        try {
            gscService.addNode(request);
            responseVO.setResult(200, "提交成功");
        } catch (Exception e) {
            log.error("GscController addGsc request -> {} \n Exception", request.toString(), e);
            responseVO.setResult(500, "提交失败");
        }
        return responseVO;
    }

    /**
     * 获取GSC分页信息
     * @param request
     * @return
     */
    @PostMapping(path = "/queryNodePage")
    public ResponseVO<QueryGscPageResponse> queryNodePage(@Valid @RequestBody QueryGscPageRequest request) {
        ResponseVO<QueryGscPageResponse> responseVO = new ResponseVO<>();
        try {
            QueryGscPageResponse queryGscPageResponse = gscService.queryCloseEventGroup(request);
            responseVO.setResult(200, "SUCCESS", queryGscPageResponse);
        } catch (Exception e) {
            log.error("GscController queryGscPage request -> {} \n Exception", request.toString(), e);
            responseVO.setResult(500, "获取GSC节点信息失败");
        }
        return responseVO;
    }
}
