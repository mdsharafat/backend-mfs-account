package com.mfs.account.service.registration;

import com.mfs.account.entity.UserEntity;
import com.mfs.account.model.UserRegistrationRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CU")
public class CustomerRegistrationRegistrationServiceImplCommon implements CommonUserRegistrationService {

    @Autowired
    CommonCommonUserRegistrationServiceImpl commonCommonUserRegistrationService;

    @Override
    public UserEntity userRegistration(UserRegistrationRequestModel userRegistrationRequestModel) {
        return commonCommonUserRegistrationService.userRegistration(userRegistrationRequestModel);
    }
}
