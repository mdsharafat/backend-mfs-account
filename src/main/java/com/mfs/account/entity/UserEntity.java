package com.mfs.account.entity;

import com.mfs.account.converter.AccountStatusEnumConverter;
import com.mfs.account.converter.AccountTypeEnumConverter;
import com.mfs.account.converter.GenderEnumConverter;
import com.mfs.account.domain.BaseDomain;
import com.mfs.account.enumeration.AccountStatusEnum;
import com.mfs.account.enumeration.AccountTypeEnum;
import com.mfs.account.enumeration.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "ACCOUNT_DETAILS")
public class UserEntity extends BaseDomain {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AccountDetailsSeqGenerator")
    @SequenceGenerator(name = "AccountDetailsSeqGenerator", sequenceName = "ACC_DETAILS_SEQ_GEN")
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ACCOUNT_NO")
    private String accountNo;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "USER_TYPE")
    @Convert(converter = AccountTypeEnumConverter.class)
    private AccountTypeEnum userType;

    @Column(name = "PIN")
    private String pin;

    @Column(name = "ACCOUNT_STATUS")
    @Convert(converter = AccountStatusEnumConverter.class)
    private AccountStatusEnum accountStatus;

    @Column(name = "DOB")
    private Date dob;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "GENDER")
    @Convert(converter = GenderEnumConverter.class)
    private GenderEnum gender;

}
