package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceInventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceInventoryRepository extends JpaRepository<ResourceInventoryEntity,Integer>, JpaSpecificationExecutor<ResourceInventoryEntity> {
}
