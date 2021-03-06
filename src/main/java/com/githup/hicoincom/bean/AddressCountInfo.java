package com.githup.hicoincom.bean;

import java.io.Serializable;

/**
 * @Description: 返回地址数量信息
 * @Author: ZPZ
 * @Version: 1.0
 * @Date: 2021-01-28 10:55
 **/
public class AddressCountInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String symbol;
    private int count;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
