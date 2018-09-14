package com.demo.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class GscRequest {

    @NotNull(message = "节点不可为空")
    private String gscGsnode;

    @Override
    public String toString() {
        return "GscRequest{" +
                "gscGsnode='" + gscGsnode + '\'' +
                '}';
    }
}
