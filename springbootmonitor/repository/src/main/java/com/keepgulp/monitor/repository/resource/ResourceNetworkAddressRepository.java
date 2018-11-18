package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceNetworkAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceNetworkAddressRepository extends JpaRepository<ResourceNetworkAddressEntity,Integer>, JpaSpecificationExecutor<ResourceNetworkAddressEntity> {
}
