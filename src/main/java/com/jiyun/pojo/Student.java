package com.jiyun.pojo;

import javax.persistence.Id;
import java.util.Date;

public class Student {
    @Id
    private Integer sid;
    private String sxh;
    private String sname;
    private Integer ssex;
    private Date sbir;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sxh='" + sxh + '\'' +
                ", sname='" + sname + '\'' +
                ", ssex=" + ssex +
                ", sbir=" + sbir +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSxh() {
        return sxh;
    }

    public void setSxh(String sxh) {
        this.sxh = sxh;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public Date getSbir() {
        return sbir;
    }

    public void setSbir(Date sbir) {
        this.sbir = sbir;
    }
}
