package com.qiaohui.community.util;

import com.qiaohui.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author zqh
 * @create 2023-09-05-15:55
 * 作为一个容器，持有用户信息，用于代替session对象
 * ThreadLocal以线程为key，相当于一个mao存取key、value
 */
@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<>();
    public void setUsers(User user){
        users.set(user);
    }
    public User getUser(){
        return users.get();
    }
    public void clear(){
        users.remove();
    }

}
