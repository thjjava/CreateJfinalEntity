package com.sttri.entity;

import com.jfinal.plugin.activerecord.Model; 

public class Job_main extends Model<Job_main>{

    private static final long serialVersionUID = 1L;
    public static final Job_main dao = new Job_main();

    /**表名**/ 
    public static String TABLE = "job_main";
    /****/
    public static final String JOB_ID = "JOB_ID";
    /****/
    public static final String JOB_NAME = "JOB_NAME";
    /****/
    public static final String CRON_EXPRESSION = "CRON_EXPRESSION";
    /****/
    public static final String SERVICE_NAME = "SERVICE_NAME";
    /****/
    public static final String METHOD_NAME = "METHOD_NAME";
    /****/
    public static final String REMARK = "REMARK";
    /****/
    public static final String STATUS = "STATUS";
    /****/
    public static final String LAST_EXECUTE_TIME = "LAST_EXECUTE_TIME";
    /****/
    public static final String LAST_EXECUTE_STATUS = "LAST_EXECUTE_STATUS";
    /****/
    public static final String FAIL_REASON = "FAIL_REASON";
    /****/
    public static final String JOB_TYPE = "JOB_TYPE";
 }