package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceServerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceServerRepository extends JpaRepository<ResourceServerEntity,Integer>, JpaSpecificationExecutor<ResourceServerEntity> {
}
