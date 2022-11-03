package com.mfs.account.converter;

import com.mfs.account.enumeration.GenderEnum;

import javax.persistence.AttributeConverter;

public class GenderEnumConverter implements AttributeConverter<GenderEnum, String> {
    @Override
    public String convertToDatabaseColumn(GenderEnum attribute) {
        if (attribute == null)
            return null;
        else
            return attribute.getVal();
    }

    @Override
    public GenderEnum convertToEntityAttribute(String dbData) {
        return GenderEnum.getEnumFromCode(dbData);
    }
}
