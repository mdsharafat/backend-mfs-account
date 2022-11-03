package com.mfs.account.service.registration;

import com.mfs.account.entity.AgDhMappingEntity;
import com.mfs.account.entity.UserEntity;
import com.mfs.account.model.UserRegistrationRequestModel;
import com.mfs.account.repo.AgDhMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("AG")
public class AgentRegistrationRegistrationServiceImplCommon implements CommonUserRegistrationService {

    @Autowired
    CommonCommonUserRegistrationServiceImpl commonCommonUserRegistrationService;

    @Autowired
    AgDhMapRepository agDhMapRepository;

    @Transactional
    @Override
    public UserEntity userRegistration(UserRegistrationRequestModel userRegistrationRequestModel) {
        UserEntity userEntity = commonCommonUserRegistrationService.userRegistration(userRegistrationRequestModel);
        mapWithDistributor(userEntity.getId().toString() ,userRegistrationRequestModel.getParentId());
        return userEntity;
    }

    private void mapWithDistributor(String userId, String parentId) {
        AgDhMappingEntity agDhMappingEntity = AgDhMappingEntity.builder()
                .agentId(userId)
                .distributorId(parentId)
                .build();
        agDhMapRepository.save(agDhMappingEntity);
    }
}
