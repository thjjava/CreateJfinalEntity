package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Vod_video_type extends Model<Vod_video_type>{

    private static final long serialVersionUID = 1L;
    public static final Vod_video_type dao = new Vod_video_type();

    /**表名**/ 
    public static String TABLE = "VOD_VIDEO_TYPE";
    /****/
    public static final String ID = "ID";
    /****/
    public static final String VIDEOID = "VideoID";
    /****/
    public static final String TYPEID = "TypeID";
    /****/
    public static final String ADDDATE = "AddDate";
 }