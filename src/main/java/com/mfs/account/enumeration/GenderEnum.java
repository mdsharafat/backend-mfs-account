package com.mfs.account.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.HashMap;
import java.util.Map;

public enum GenderEnum {

    M("1"),
    F("2"),
    O("3");

    private String val;

    GenderEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }


    private static final Map<String, GenderEnum> MAP_GENDER = new HashMap<>();

    static {
        for (GenderEnum genderEnum : values()) {
            MAP_GENDER.put(genderEnum.val, genderEnum);
        }
    }

    public static GenderEnum getEnumFromCode(String code) {
        return MAP_GENDER.get(code);
    }
}
