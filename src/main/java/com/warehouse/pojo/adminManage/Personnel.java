package com.warehouse.pojo.adminManage;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Personnel {
    private Integer id;

    private String pname;

    private String ppassword;

    private Integer d_id;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date entrytime;

    private Integer quit;

    private Date quittime;

    private String phone;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPpassword() {
        return ppassword;
    }

    public void setPpassword(String ppassword) {
        this.ppassword = ppassword == null ? null : ppassword.trim();
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Integer getQuit() {
        return quit;
    }

    public void setQuit(Integer quit) {
        this.quit = quit;
    }

    public Date getQuittime() {
        return quittime;
    }

    public void setQuittime(Date quittime) {
        this.quittime = quittime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}