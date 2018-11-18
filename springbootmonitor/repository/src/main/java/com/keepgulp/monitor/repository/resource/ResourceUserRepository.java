package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceUserRepository extends JpaRepository<ResourceUserEntity,Integer>, JpaSpecificationExecutor<ResourceUserEntity> {
}
