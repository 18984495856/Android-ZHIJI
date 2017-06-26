package com.example.lys.netinfomation.control;

/**
 * Created by Lys on 2017/5/22.
 */

/**
 * 控制管理，这里管理了程序的运行状态，
 * 1.客户端上的账号信息
 * 2.服务器地址
 */
public class MangerControl {
    private static User user = new User();
    private static String serverUrl = "127.0.0.1";

    public static void setUserId(String id){
        user.setId(id);
    }

    public static void setUserPassword(String password){
        user.setPassword(password);
    }

    public static void setUserName(String name){
        user.setName(name);
    }

    public static String getUserId(){
        return user.getId();
    }

    public static String getUserPassword(){
       return user.getPassword();
    }

    public static String getUserName(){
       return user.getName();
    }

    public static String getServerUrl() {
        return serverUrl;
    }
}
