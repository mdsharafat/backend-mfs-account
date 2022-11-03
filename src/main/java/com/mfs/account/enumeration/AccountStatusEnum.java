package com.mfs.account.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.HashMap;
import java.util.Map;

public enum AccountStatusEnum {

    ACTIVE("A"),
    INACTIVE("I"),
    SUSPENDED("S");

    private String val;

    AccountStatusEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    private static final Map<String, AccountStatusEnum> MAP_VAL_ACCOUNT_STATUS = new HashMap<>();

    static {
        for (AccountStatusEnum accountStatusEnum : values()) {
            MAP_VAL_ACCOUNT_STATUS.put(accountStatusEnum.val, accountStatusEnum);
        }
    }

    public static AccountStatusEnum getEnumFromCode(String val) {
        return MAP_VAL_ACCOUNT_STATUS.get(val);
    }
}
