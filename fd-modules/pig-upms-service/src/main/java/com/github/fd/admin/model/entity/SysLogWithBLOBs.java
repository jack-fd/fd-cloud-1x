package com.github.fd.admin.model.entity;

import java.util.Date;

public class SysLogWithBLOBs extends SysLog {
    private String params;

    private String time;

    private String exception;

    public SysLogWithBLOBs(Long id, String type, String title, String serviceId, String createBy, Date createTime, Date updateTime, String remoteAddr, String userAgent, String requestUri, String method, String delFlag, String params, String time, String exception) {
        super(id, type, title, serviceId, createBy, createTime, updateTime, remoteAddr, userAgent, requestUri, method, delFlag);
        this.params = params;
        this.time = time;
        this.exception = exception;
    }

    public SysLogWithBLOBs() {
        super();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }
}