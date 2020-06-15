package com.hua.shi.core.luhucore.service;

import com.hua.shi.entity.TAccount;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RefreshScope
public class AccountServiceImpl implements AccoutService {

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Override
    public List<TAccount> queryList() {
        System.out.println("从配置中心拿到的用户名:"+username);
        System.out.println("从配置中心拿到的密码:"+password);
        return null;
    }
}
