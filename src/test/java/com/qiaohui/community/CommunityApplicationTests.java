package com.qiaohui.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class) //让test可以和application有一样的配置
public class CommunityApplicationTests implements ApplicationContextAware {

    //ApplicationContext是提供了一个Spring容器，把这个Spring容器传进来
    private ApplicationContext applicationContext;  //记录下这个容器

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext; //传进来之后，其它方法就能使用这个容器
    }

    @Test
    public void testApplicationContext(){
        System.out.println(applicationContext);
    }
}
