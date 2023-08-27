package com.qiaohui.community.dao;

import com.qiaohui.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

import javax.jws.soap.SOAPBinding;

/**
 * @author zqh
 * @create 2023-08-21-15:56
 * 这里只用写接口，不用写实现类，因为mybatis有提供方法，只需要配置sql的xml文件
 */
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id,int status);

    int updateHeader(int id,String headerUrl);

    int updatePassword(int id,String password);


}
