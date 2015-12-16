package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Job_log extends Model<Job_log>{

    private static final long serialVersionUID = 1L;
    public static final Job_log dao = new Job_log();

    /**表名**/ 
    public static String TABLE = "job_log";
    /****/
    public static final String ID = "ID";
    /****/
    public static final String JOB_ID = "JOB_ID";
    /****/
    public static final String LOG_LEVEL = "LOG_LEVEL";
    /****/
    public static final String NOTE = "NOTE";
    /****/
    public static final String CREATE_TIME = "CREATE_TIME";
 }