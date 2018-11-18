package com.keepgulp.monitor.service.common.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.common.AuthorityUserEntity;
import com.keepgulp.monitor.repository.common.AuthorityUserRepository;
import com.keepgulp.monitor.service.common.AuthorityUserService;
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
public class AuthorityUserServiceImpl implements AuthorityUserService {

    @Resource
    private AuthorityUserRepository repository;

    @Override
    public Page<AuthorityUserEntity> findAll(SearchMap searchMap, Pageable pageable) {
        Page<AuthorityUserEntity> allPage = repository.findAll(new Specification<AuthorityUserEntity>(){
            @Override
            public Predicate toPredicate(Root<AuthorityUserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
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

    @Override
    public void delete(AuthorityUserEntity entity) {
        repository.delete(entity);
    }

    @Override
    public void update(AuthorityUserEntity entity) {
        repository.saveAndFlush(entity);
    }

    @Override
    public void save(AuthorityUserEntity entity) {
        repository.save(entity);
    }
}
