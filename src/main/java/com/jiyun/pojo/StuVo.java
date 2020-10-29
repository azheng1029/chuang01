package com.jiyun.pojo;

import java.util.Date;

public class StuVo extends Student{
    private Date startTime;
    private Date endTime;

    @Override
    public String toString() {
        return "StuVo{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
