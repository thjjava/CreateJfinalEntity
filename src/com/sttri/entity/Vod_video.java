package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Vod_video extends Model<Vod_video>{

    private static final long serialVersionUID = 1L;
    public static final Vod_video dao = new Vod_video();

    /**表名**/ 
    public static String TABLE = "VOD_VIDEO";
    /****/
    public static final String ID = "ID";
    /****/
    public static final String VIDEONAME = "VideoName";
    /****/
    public static final String MAKETIME = "MakeTime";
    /****/
    public static final String PUBLICFLAG = "PublicFlag";
    /****/
    public static final String PUBLICTIME = "PublicTime";
    /****/
    public static final String TIMELEN = "TimeLen";
    /****/
    public static final String FILESIZE = "FileSize";
    /****/
    public static final String RECORDCOUNT = "RecordCount";
    /****/
    public static final String GOODCOUNT = "GoodCount";
    /****/
    public static final String COMMENTCOUNT = "CommentCount";
    /****/
    public static final String FILEURL = "FileUrl";
    /****/
    public static final String PICURL = "PicUrl";
    /****/
    public static final String VIDEODESC = "VideoDesc";
 }