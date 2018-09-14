package com.demo.dao;

import com.demo.domain.GscEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GscDao extends JpaRepository<GscEntity, String>, JpaSpecificationExecutor<GscEntity> {

    @Query(value = "select gsc from GscEntity  gsc where gsc.gsnode = :#{#gesNode} and gsc.isDeleted in ('0','')")

    GscEntity queryGesNode(@Param("gesNode") String gesNode) throws Exception;
}
