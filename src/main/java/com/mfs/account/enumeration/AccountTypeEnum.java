package com.mfs.account.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.HashMap;
import java.util.Map;

public enum AccountTypeEnum {
    ST("1"),
    DH("2"),
    AG("3"),
    CU("4"),
    AC("5");

    private String val;

    AccountTypeEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }


    private  static final Map<String, AccountTypeEnum> MAP_ROLE_ID_ACCOUNT_TYPE = new HashMap<>();

    static {
        for (AccountTypeEnum accountTypeEnum : values()) {
            MAP_ROLE_ID_ACCOUNT_TYPE.put(accountTypeEnum.val, accountTypeEnum);
        }
    }

    public static AccountTypeEnum getEnumFromCode(String val) {
        return MAP_ROLE_ID_ACCOUNT_TYPE.get(val);
    }
}
