package com.mfs.account.service.registration;

import com.mfs.account.enumeration.AccountTypeEnum;

public interface UserRegistrationServiceLocator {
    CommonUserRegistrationService getServiceBean(AccountTypeEnum serviceName);
}
