package com.keepgulp.monitor.repository.resource;

import com.keepgulp.monitor.entity.resource.ResourceEntnameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceEntnameRepository extends JpaRepository<ResourceEntnameEntity,Integer>, JpaSpecificationExecutor<ResourceEntnameEntity> {
}
