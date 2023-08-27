package com.qiaohui.community.dao;

import com.qiaohui.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zqh
 * @create 2023-08-22-15:16
 */
@Mapper
public interface DiscussPostMapper {

    //添加分页功能，要根据userId，当前是第几行（offset），一页显示多少行（limit）
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    //查询帖子的行数
    //@Param注解用于给参数取别名。如果只有一个参数，且在动态sql语句<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
