package com.githup.hicoincom.api.impl;

import com.githup.hicoincom.WalletConfig;
import com.githup.hicoincom.api.BaseApi;
import com.githup.hicoincom.api.IDepositNotifyService;
import com.githup.hicoincom.api.urls.ApiUri;
import com.githup.hicoincom.bean.args.DepositArgs;
import com.githup.hicoincom.bean.args.InternalNotifyArgs;
import com.githup.hicoincom.bean.result.DepositNotifyResult;
import com.githup.hicoincom.bean.result.SimpleResult;
import com.githup.hicoincom.crypto.IDataCrypto;
import com.githup.hicoincom.exception.ArgsNullException;

/**
 * @Description: 充值通知服务实现类
 * @Author: ZPZ
 * @Version: 1.0
 * @Date: 2021-01-29 18:54
 **/
public class DepositNotifyService extends BaseApi implements IDepositNotifyService {
    public DepositNotifyService(WalletConfig cfg, IDataCrypto crypto) {
        super(cfg, crypto);
    }

    @Override
    public DepositNotifyResult depositNotify(DepositArgs args) {
        if (args == null) {
            throw new ArgsNullException("args can not be null");
        }
        return this.invoke(ApiUri.DEPOSIT_NOTIFY, args, DepositNotifyResult.class);
    }

    @Override
    public SimpleResult internalNotify(InternalNotifyArgs args) {
        if (args == null) {
            throw new ArgsNullException("args can not be null");
        }
        return this.invoke(ApiUri.INTERNAL_NOTIFY, args, SimpleResult.class);
    }
}
