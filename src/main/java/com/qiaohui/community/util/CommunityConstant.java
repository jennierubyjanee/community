package com.qiaohui.community.util;

/**
 * @author zqh
 * @create 2023-08-29-14:51
 */
public interface CommunityConstant {

    /**
     * 激活成功
     */
    int ACTIVATION_SUCCESS = 0;

    /**
     * 重复激活
     */
    int ACTIVATION_REPEAT = 1;

    /**
     * 激活失败
     */
    int ACTIVATION_FAILURE = 2;

    /**
     * 默认登陆凭证超时时间
     */
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    /**
     * 勾选“记住我”的超时时间
     */
    int REMEMBERME_EXPIRED_SECONDS = 100 * 3600 * 12;

}
