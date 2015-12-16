package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Vod_user_login extends Model<Vod_user_login>{

    private static final long serialVersionUID = 1L;
    public static final Vod_user_login dao = new Vod_user_login();

    /**表名**/ 
    public static String TABLE = "VOD_USER_LOGIN";
    /****/
    public static final String ID = "ID";
    /****/
    public static final String USERID = "UserID";
    /****/
    public static final String CLIENTIP = "ClientIP";
    /****/
    public static final String LOGINDATE = "LoginDate";
 }