package com.mfs.account.service.registration;

import com.mfs.account.dao.UserDao;
import com.mfs.account.entity.UserEntity;
import com.mfs.account.enumeration.AccountStatusEnum;
import com.mfs.account.model.UserRegistrationRequestModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommonCommonUserRegistrationServiceImpl implements CommonUserRegistrationService {

    @Autowired
    UserDao userDao;

    @Override
    public UserEntity userRegistration(UserRegistrationRequestModel userRegistrationRequestModel) {
        UserEntity userEntity = UserEntity.builder()
                .name(userRegistrationRequestModel.getName())
                .accountNo(userRegistrationRequestModel.getAccountNo())
                .email(userRegistrationRequestModel.getEmail())
                .userType(userRegistrationRequestModel.getUserType())
                .pin(userRegistrationRequestModel.getPin())
                .accountStatus(AccountStatusEnum.ACTIVE)
                .dob(userRegistrationRequestModel.getDob())
                .address(userRegistrationRequestModel.getAddress())
                .gender(userRegistrationRequestModel.getGender())
                .build();
        return userDao.createNewAccount(userEntity);
    }
}
