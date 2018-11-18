package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceServerTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceServerTypeRepository extends JpaRepository<ResourceServerTypeEntity,Integer>, JpaSpecificationExecutor<ResourceServerTypeEntity> {
}
