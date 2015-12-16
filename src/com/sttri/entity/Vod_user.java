package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Vod_user extends Model<Vod_user>{

    private static final long serialVersionUID = 1L;
    public static final Vod_user dao = new Vod_user();

    /**表名**/ 
    public static String TABLE = "VOD_USER";
    /****/
    public static final String ID = "ID";
    /****/
    public static final String ACCOUNT = "Account";
    /****/
    public static final String PASSWORD = "Password";
    /****/
    public static final String USERNAME = "UserName";
    /****/
    public static final String TELNO = "TelNo";
    /****/
    public static final String REGISTERDATE = "RegisterDate";
    /****/
    public static final String LOGINDATE = "LoginDate";
 }