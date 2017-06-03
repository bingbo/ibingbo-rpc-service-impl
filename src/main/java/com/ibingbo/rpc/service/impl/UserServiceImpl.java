package com.ibingbo.rpc.service.impl;

import com.ibingbo.rpc.common.annotation.RpcService;
import com.ibingbo.rpc.service.IUserService;
import com.ibingbo.rpc.service.entity.User;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by bing on 17/6/3.
 */
@RpcService(IUserService.class)
public class UserServiceImpl implements IUserService {
    public User getUser(String name) {
        User user = new User(name, new Date(), true);
        return user;
    }

    public List<User> getUsers(int size) {
        List<User> list = new ArrayList<User>();
        User user = null;
        String name = "foo";
        Date birthday = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthday);
        for (int i = 0; i < size; i++) {
            cal.add(Calendar.DAY_OF_MONTH, 1);
            user = new User(name, cal.getTime(), i % 2 == 0 ? true : false);
            list.add(user);
        }
        return list;
    }

}
