package com.demo.controller;

import com.demo.reponse.ResponseVO;
import com.demo.reponse.gsc.QueryGscPageResponse;
import com.demo.request.AddGscRequest;
import com.demo.request.GscRequest;
import com.demo.request.QueryGscPageRequest;
import com.demo.request.UpdateGsc;
import com.demo.service.GscService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/gsc")
@Slf4j
@CrossOrigin
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

    /**
     * 编辑GSC页面信息
     * @param request
     * @return
     */

    @PostMapping(path = "/updateNodePage")
    public ResponseVO updateNodePage(@Valid @RequestBody UpdateGsc request) {
        ResponseVO responseVO = new ResponseVO();
        try {
            gscService.updateNodePage(request);
            responseVO.setResult(200, "修改成功");
        } catch (Exception e) {
            log.error("GscController updateNodePage request -> {} \n Exception", request.toString(), e);
            responseVO.setResult(500, "修改失败");
        }
        return responseVO;
    }

    /**
     * 删除
     *
     * @param request
     * @return
     */
    @PostMapping("/deleteNode")
    public ResponseVO deleteNode(@Valid @RequestBody GscRequest request) {
        ResponseVO responseVO = new ResponseVO();
        try {
            gscService.deleteNode(request);
            responseVO.setResult(200, "删除成功");
        } catch (Exception e) {
            log.error("GscController deleteNode request -> {} Exception", request.toString(), e);
            responseVO.setResult(500, "删除失败");
        }
        return responseVO;
    }

    /**
     * 获取修改数据
     * @param request
     * @return
     */
    @PostMapping(path = "/queryNode")
    public ResponseVO<UpdateGsc> queryNode(@Valid @RequestBody GscRequest request) {
        ResponseVO<UpdateGsc> responseVO = new ResponseVO<>();
        try {
            UpdateGsc updateGsc = gscService.queryGscByGscnode(request);
            responseVO.setResult(200, "SUCCESS", updateGsc);
        } catch (Exception e) {
            log.error("GscController queryGscPage request -> {} \n Exception", request.toString(), e);
            responseVO.setResult(500, "获取修改数据节点信息失败");
        }
        return responseVO;
    }
}
