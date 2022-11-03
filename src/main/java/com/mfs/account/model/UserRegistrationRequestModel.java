package com.mfs.account.model;

import com.mfs.account.enumeration.AccountTypeEnum;
import com.mfs.account.enumeration.GenderEnum;
import lombok.Data;

import java.util.Date;

@Data
public class UserRegistrationRequestModel {
    private String name;
    private String accountNo;
    private String email;
    private AccountTypeEnum userType;
    private String pin;
    private Date dob;
    private String address;
    private GenderEnum gender;
    private String parentId;
}
