package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Vod_type extends Model<Vod_type>{

    private static final long serialVersionUID = 1L;
    public static final Vod_type dao = new Vod_type();

    /**表名**/ 
    public static String TABLE = "VOD_TYPE";
    /****/
    public static final String ID = "ID";
    /****/
    public static final String TYPENAME = "TypeName";
    /****/
    public static final String SORTNO = "SortNo";
    /****/
    public static final String ADDDATE = "AddDate";
 }