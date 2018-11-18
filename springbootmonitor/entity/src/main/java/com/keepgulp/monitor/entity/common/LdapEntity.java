package com.keepgulp.monitor.entity.common;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * ldap登陆使用验证
 */
@Data
@Resource
public class LdapEntity {

    private String ldapServer;
    private int ldapPort;
    private String ldapPrefix;
    private String ldapUsername;
    private String ldapPassword;
    private String ldapSearchBase;
}
