package com.warehouse.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 其他收入支出类
 * @author Administrator
 *
 */
public class OtherPayPal {
    private Integer id;

    /**
     * 员工id
     */
    private Integer empId;

    private Date date;

    private BigDecimal money;

    /**
     * 账户id
     */
    private Integer COMAccountId;

    /**
     * 单据类型 1为收入 2为支出
     */
    private Integer docType;

    private String comment;

    /**
     * 是否以审核 0为未审核 1为以审核 默认为0
     */
    private Integer isEffective;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getCOMAccountId() {
        return COMAccountId;
    }

    public void setCOMAccountId(Integer COMAccountId) {
        this.COMAccountId = COMAccountId;
    }

    public Integer getDocType() {
        return docType;
    }

    public void setDocType(Integer docType) {
        this.docType = docType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}