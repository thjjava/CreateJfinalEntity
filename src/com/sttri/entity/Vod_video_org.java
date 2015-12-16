package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Vod_video_org extends Model<Vod_video_org>{

    private static final long serialVersionUID = 1L;
    public static final Vod_video_org dao = new Vod_video_org();

    /**表名**/ 
    public static String TABLE = "VOD_VIDEO_ORG";
    /****/
    public static final String ID = "ID";
    /****/
    public static final String ORGID = "OrgID";
    /****/
    public static final String VIDEOID = "VideoID";
    /****/
    public static final String ADDDATE = "AddDate";
 }