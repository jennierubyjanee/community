package com.qiaohui.community.dao;

import com.qiaohui.community.entity.LoginTicket;
import org.apache.ibatis.annotations.*;

/**
 * @author zqh
 * @create 2023-08-31-13:40
 */
@Mapper
public interface LoginTicketMapper {

    @Insert({
            "insert into login_ticket(user_id,ticket,status,expired) ",
            "values(#{userId},#{ticket},#{status},#{expired})"
    })
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insertLoginTicket(LoginTicket loginTicket);

    @Select({
            "select id,user_id,ticket,status,expired ",
            "from login_ticket where ticket=#{ticket} "
    })
    LoginTicket selectByTicket(String ticket);

    @Update({
            "<script>",
            "update login_ticket set status=#{status} where ticket=#{ticket} ",
            "<if test=\"ticket!=null\"> ",
            "and 1=1 ",
            "</if>",
            "</script>"
    })
    int updateStatus(String ticket,int status);

    @Delete({
            "delete from login_ticket where ticket=#{ticket} "
    })
    int deleteLoginTicket(String ticket);

}
