package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceServiceRepository extends JpaRepository<ResourceServiceEntity,Integer>, JpaSpecificationExecutor<ResourceServiceEntity> {
}
