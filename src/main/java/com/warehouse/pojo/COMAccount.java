package com.warehouse.pojo;

import java.math.BigDecimal;

/**
 * 公司账户类
 * @author Administrator
 *
 */
public class COMAccount {
    private Integer id;

    private String account;

    /**
     * 余额
     */
    private BigDecimal remaining;

    /**
     * 银行名
     */
    private String bank_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public BigDecimal getRemaining() {
        return remaining;
    }

    public void setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name == null ? null : bank_name.trim();
    }
}