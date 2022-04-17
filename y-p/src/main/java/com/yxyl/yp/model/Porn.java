package com.yxyl.yp.model;

import java.io.Serializable;

public class Porn implements Serializable {
    private Integer pornId;

    private String pornHref;

    private String pornTitle;

    private String pornTypes;

    private String pornWatch;

    private byte[] pornTime;

    private static final long serialVersionUID = 1L;

    public Integer getPornId() {
        return pornId;
    }

    public void setPornId(Integer pornId) {
        this.pornId = pornId;
    }

    public String getPornHref() {
        return pornHref;
    }

    public void setPornHref(String pornHref) {
        this.pornHref = pornHref;
    }

    public String getPornTitle() {
        return pornTitle;
    }

    public void setPornTitle(String pornTitle) {
        this.pornTitle = pornTitle;
    }

    public String getPornTypes() {
        return pornTypes;
    }

    public void setPornTypes(String pornTypes) {
        this.pornTypes = pornTypes;
    }

    public String getPornWatch() {
        return pornWatch;
    }

    public void setPornWatch(String pornWatch) {
        this.pornWatch = pornWatch;
    }

    public byte[] getPornTime() {
        return pornTime;
    }

    public void setPornTime(byte[] pornTime) {
        this.pornTime = pornTime;
    }
}