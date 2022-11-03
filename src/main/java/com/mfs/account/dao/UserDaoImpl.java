package com.mfs.account.dao;

import com.mfs.account.entity.UserEntity;
import com.mfs.account.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity createNewAccount(UserEntity userEntity) {
        userRepository.save(userEntity);
        return userEntity;
    }
}
