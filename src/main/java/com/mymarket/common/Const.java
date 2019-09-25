package com.mymarket.common;

public class Const {
    public static final String CURRENT_USER = "currentuser";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    public interface Role{
        int ROLE_CUETOMER = 0; //普通用户
        int ROLE_ADMIN = 1;  //管理员
    }
}
