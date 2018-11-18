package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceCabinetEntity;
import com.keepgulp.monitor.repository.resource.ResourceCabinetRepository;
import com.keepgulp.monitor.service.resource.ResourceCabinetService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResourceCabinetServiceImpl implements ResourceCabinetService {

    @Resource
    ResourceCabinetRepository repository;

    @Override
    public Page<ResourceCabinetEntity> findAll(SearchMap searchMap, Pageable pageable) {
        Page<ResourceCabinetEntity> allPage = repository.findAll(new Specification<ResourceCabinetEntity>(){
            @Override
            public Predicate toPredicate(Root<ResourceCabinetEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<Predicate>();
                if(null!=searchMap.get("name") && !"".equals(searchMap.get("name"))) {
                    list.add(criteriaBuilder.equal(root.get("name").as(String.class), String.valueOf(searchMap.get("name"))));
                }
                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        }, pageable);
        return allPage;
    }
}
