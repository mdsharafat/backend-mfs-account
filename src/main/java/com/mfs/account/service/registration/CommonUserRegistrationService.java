package com.mfs.account.service.registration;

import com.mfs.account.entity.UserEntity;
import com.mfs.account.model.UserRegistrationRequestModel;

public interface CommonUserRegistrationService {
    UserEntity userRegistration(UserRegistrationRequestModel userRegistrationRequestModel);
}
