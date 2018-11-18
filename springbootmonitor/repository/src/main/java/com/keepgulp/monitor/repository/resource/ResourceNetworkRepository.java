package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceNetworkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceNetworkRepository extends JpaRepository<ResourceNetworkEntity,Integer>, JpaSpecificationExecutor<ResourceNetworkEntity> {
}
