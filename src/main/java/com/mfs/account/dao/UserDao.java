package com.mfs.account.dao;

import com.mfs.account.entity.UserEntity;

public interface UserDao {
    UserEntity createNewAccount(UserEntity userEntity);
}
