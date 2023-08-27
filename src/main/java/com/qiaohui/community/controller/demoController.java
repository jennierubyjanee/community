package com.qiaohui.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Enumeration;

/**
 * @author zqh
 * @create 2023-08-18-15:23
 */
@Controller
@RequestMapping("/demo")
public class demoController {
    @RequestMapping("/http")
    public void http(HttpServletRequest request,HttpServletResponse response){

        //获取请求
        System.out.println(request.getMethod());
        System.out.println(request.getServletPath());
        Enumeration<String> enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()){
            String name = enumeration.nextElement();
            String value = request.getHeader(name);
            System.out.println(name + ":" + value);
        }

        //响应请求
        response.setContentType("text/html;charset = utf-8");
        try(PrintWriter writer = response.getWriter();) {
            writer.write("<h1>巴啦啦能量</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
