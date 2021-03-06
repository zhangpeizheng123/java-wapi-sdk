package com.githup.hicoincom.bean.result;

import com.alibaba.fastjson.JSONObject;
import com.githup.hicoincom.bean.WithdrawConsumeInfo;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 提币返回结果
 * @Author: ZPZ
 * @Version: 1.0
 * @Date: 2021-01-28 14:22
 **/
public class WithdrawConsumeResult extends Result<List<WithdrawConsumeInfo>> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public List<WithdrawConsumeInfo> getData() {
        return JSONObject.parseArray(getRawData(), WithdrawConsumeInfo.class);
    }
}
