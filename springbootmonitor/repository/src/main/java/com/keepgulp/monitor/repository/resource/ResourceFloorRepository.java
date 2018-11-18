package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceEntnameEntity;
import com.keepgulp.monitor.entity.resource.ResourceFloorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceFloorRepository extends JpaRepository<ResourceFloorEntity,Integer>, JpaSpecificationExecutor<ResourceFloorEntity> {
}
