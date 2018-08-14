package com.demo.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class QueryGscPageRequest {

    @NotNull(message = "页码不能为空")
    private int page;
    @NotNull(message = "每页记录数不能为空")
    private int size;
    @NotNull(message = "光速节点名称不可为空")
    private String gsnode;

    @Override
    public String toString() {
        return "QueryGscPageRequest{" +
                "page=" + page +
                ", size=" + size +
                ", gsnode='" + gsnode + '\'' +
                '}';
    }
}
