package com.example.lys.netinfomation.control;

/**
 * Created by Lys on 2017/5/22.
 */

/**
 * 该类除了ID和password这两个属性，其它属性在调用GET方法时会先联网获取数据，再返回数据。
 */
public class User {
    private String id;
    private String password;
    private String name;

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
