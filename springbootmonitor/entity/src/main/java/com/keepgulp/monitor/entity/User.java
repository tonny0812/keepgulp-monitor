package com.keepgulp.monitor.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
@Data
public class User {

    @Id
    @Column(name = "userid")
    private String userId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
}
