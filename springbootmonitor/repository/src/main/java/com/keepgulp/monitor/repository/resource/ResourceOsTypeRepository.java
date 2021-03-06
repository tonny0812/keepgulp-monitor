package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceOsTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceOsTypeRepository extends JpaRepository<ResourceOsTypeEntity,Integer>, JpaSpecificationExecutor<ResourceOsTypeEntity> {
}
