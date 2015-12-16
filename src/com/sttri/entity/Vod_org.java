package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Vod_org extends Model<Vod_org>{

    private static final long serialVersionUID = 1L;
    public static final Vod_org dao = new Vod_org();

    /**表名**/ 
    public static String TABLE = "VOD_ORG";
    /****/
    public static final String ID = "ID";
    /****/
    public static final String ORGNO = "OrgNo";
    /****/
    public static final String ORGNAME = "OrgName";
    /****/
    public static final String ORGADDR = "OrgAddr";
    /****/
    public static final String ORGLINKER = "OrgLinker";
    /****/
    public static final String TELNO = "TelNo";
    /****/
    public static final String ADDDATE = "AddDate";
 }