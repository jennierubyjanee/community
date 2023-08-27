package com.qiaohui.community.entity;

/**
 * @author zqh
 * @create 2023-08-23-15:24
 * 封装分页相关的信息
 */
public class Page {

    //当前页码
    private int current = 1;
    //一页显示多少条数据
    private int limit = 10;
    //数据总数（用于计算总页数）
    private int rows;
    //查询路径，不论是首页还是第1页，第2页...鼠标单击都是访问一个路径（链接）
    // 当然可以一个个写路径，但是能复用分页链接的话就会更方便
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >=1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    //获取当前页的起始行
    public int getOffset(){
        //current*limit - limit
        return (current-1) * limit;
    }

    //获取总页数
    public int getTotal(){
        //rows / limit [+1]
        if (rows % limit == 0){
            return rows / limit;
        }else{
            return rows / limit + 1;
        }
    }

    //获取起始页码和结束页码，比如说当前访问的是第5页，那起始页码为3，结束页码为7
    public int getFrom(){
        int from = current - 2;
        return from < 1 ? 1 :from;
    }

    public int getTo(){
        int to = current + 2;
        int total = getTotal();
        return to > total ? total : to;
    }
}
