package com.demo.service.impl;

import com.demo.domain.GscEntity;
import com.demo.request.QueryGscPageRequest;
import com.github.wenhao.jpa.Specifications;
import org.springframework.data.jpa.domain.Specification;

public class QueryGscSpec {

    public static Specification<GscEntity> queryGscSpec(QueryGscPageRequest request) {
        if (null != request.getGsnode() && !"".equals(request.getGsnode())) {
            return Specifications.<GscEntity>and()
                    .eq("isDeleted", "0")
                    .eq("gsnode", request.getGsnode())
                    .build();
        }
        else {
              return Specifications.<GscEntity>and()
                    .eq("isDeleted", "")
                    .build();

        }
    }
}

