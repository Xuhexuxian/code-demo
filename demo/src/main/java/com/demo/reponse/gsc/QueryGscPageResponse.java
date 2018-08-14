package com.demo.reponse.gsc;

import com.demo.domain.GscEntity;

import java.util.List;

public class QueryGscPageResponse {

    private int size;
    private int page;
    private long totalElements;
    private List<GscEntity> gscEntities;

    public QueryGscPageResponse() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public List<GscEntity> getGscEntities() {
        return gscEntities;
    }

    public void setGscEntities(List<GscEntity> gscEntities) {
        this.gscEntities = gscEntities;
    }
}
