package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Vod_video_record extends Model<Vod_video_record>{

    private static final long serialVersionUID = 1L;
    public static final Vod_video_record dao = new Vod_video_record();

    /**表名**/ 
    public static String TABLE = "VOD_VIDEO_RECORD";
    /****/
    public static final String ID = "ID";
    /****/
    public static final String VIDEOID = "VideoID";
    /****/
    public static final String USERID = "UserID";
    /****/
    public static final String CLIENTIP = "ClientIP";
    /****/
    public static final String BROWSETIME = "BrowseTime";
 }