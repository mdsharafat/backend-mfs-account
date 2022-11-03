package com.mfs.account.converter;

import com.mfs.account.enumeration.AccountTypeEnum;

import javax.persistence.AttributeConverter;

public class AccountTypeEnumConverter implements AttributeConverter<AccountTypeEnum, String> {
    @Override
    public String convertToDatabaseColumn(AccountTypeEnum attribute) {
        if (attribute == null)
            return null;
        else
            return attribute.getVal();
    }

    @Override
    public AccountTypeEnum convertToEntityAttribute(String dbData) {
        return AccountTypeEnum.getEnumFromCode(dbData);
    }
}
