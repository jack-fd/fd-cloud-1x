package com.github.fd.admin.model.entity;

import java.util.Date;

public class SysLog {
    private Long id;

    private String type;

    private String title;

    private String serviceId;

    private String createBy;

    private Date createTime;

    private Date updateTime;

    private String remoteAddr;

    private String userAgent;

    private String requestUri;

    private String method;

    private String delFlag;

    public SysLog(Long id, String type, String title, String serviceId, String createBy, Date createTime, Date updateTime, String remoteAddr, String userAgent, String requestUri, String method, String delFlag) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.serviceId = serviceId;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.remoteAddr = remoteAddr;
        this.userAgent = userAgent;
        this.requestUri = requestUri;
        this.method = method;
        this.delFlag = delFlag;
    }

    public SysLog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr == null ? null : remoteAddr.trim();
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri == null ? null : requestUri.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}