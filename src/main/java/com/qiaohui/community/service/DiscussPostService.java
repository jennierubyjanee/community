package com.qiaohui.community.service;

import com.qiaohui.community.dao.DiscussPostMapper;
import com.qiaohui.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zqh
 * @create 2023-08-23-10:42
 */
@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findSelectPosts(int userId,int offset,int limit){
        return discussPostMapper.selectDiscussPosts(userId,offset,limit);
    }

    public int findSelectPostRows(int userId){
        return discussPostMapper.selectDiscussPostRows(userId);
    }

}
