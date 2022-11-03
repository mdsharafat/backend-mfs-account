package com.mfs.account.converter;

import com.mfs.account.enumeration.AccountStatusEnum;

import javax.persistence.AttributeConverter;

public class AccountStatusEnumConverter implements AttributeConverter<AccountStatusEnum, String> {
    @Override
    public String convertToDatabaseColumn(AccountStatusEnum attribute) {
        if (attribute == null)
            return null;
        else
            return attribute.getVal();
    }

    @Override
    public AccountStatusEnum convertToEntityAttribute(String dbData) {
        return AccountStatusEnum.getEnumFromCode(dbData);
    }
}
