package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Vod_org_user extends Model<Vod_org_user>{

    private static final long serialVersionUID = 1L;
    public static final Vod_org_user dao = new Vod_org_user();

    /**表名**/ 
    public static String TABLE = "VOD_ORG_USER";
    /****/
    public static final String ID = "ID";
    /****/
    public static final String USERID = "UserID";
    /****/
    public static final String ORGID = "OrgID";
    /****/
    public static final String ADDDATE = "AddDate";
 }