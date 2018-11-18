package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceGroupsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceGroupsRepository extends JpaRepository<ResourceGroupsEntity,Integer>, JpaSpecificationExecutor<ResourceGroupsEntity> {
}
