package com.mfs.account.entity;

import com.mfs.account.converter.AccountTypeEnumConverter;
import com.mfs.account.domain.BaseDomain;
import com.mfs.account.enumeration.AccountTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SYSTEM_ACCOUNT")
public class SystemAccountEntity extends BaseDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SystemAccountSequenceGenerator")
    @SequenceGenerator(name = "SystemAccountSequenceGenerator", sequenceName = "SYS_ACC_SEQ_GEN")
    @Column(name = "ID")
    private Long id;

    @Column(name = "ACCOUNT_TYPE")
    @Convert(converter = AccountTypeEnumConverter.class)
    private AccountTypeEnum accountType;

    @Column(name = "ACCOUNT_BALANCE")
    private BigInteger accountBalance;
}
