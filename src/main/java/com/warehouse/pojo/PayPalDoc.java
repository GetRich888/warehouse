package com.warehouse.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 收付款
 * @author Administrator
 *
 */
public class PayPalDoc {
    private Integer id;

    /**
     * 单号
     */
    private String documents;

    private Integer target;

    /**
     * 应付/应收金额
     */
    private BigDecimal should;

    /**
     * 实付/实收金额
     */
    private BigDecimal fact;

    private Date date;

    /**
     * 制单人id
     */
    private Integer makeMan;

    private Integer docType;

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

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents == null ? null : documents.trim();
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

    public BigDecimal getShould() {
        return should;
    }

    public void setShould(BigDecimal should) {
        this.should = should;
    }

    public BigDecimal getFact() {
        return fact;
    }

    public void setFact(BigDecimal fact) {
        this.fact = fact;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getMakeMan() {
        return makeMan;
    }

    public void setMakeMan(Integer makeMan) {
        this.makeMan = makeMan;
    }

    public Integer getDocType() {
        return docType;
    }

    public void setDocType(Integer docType) {
        this.docType = docType;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}