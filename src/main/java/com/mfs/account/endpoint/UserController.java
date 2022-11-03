package com.mfs.account.endpoint;


import com.mfs.account.model.UserRegistrationRequestModel;
import com.mfs.account.service.registration.UserRegistrationServiceLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/account")
public class UserController {

    @Autowired
    UserRegistrationServiceLocator userRegistrationServiceLocator;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createNewAccount(@RequestBody UserRegistrationRequestModel userRegistrationRequestModel) {
        System.out.println(userRegistrationRequestModel.getUserType());
        userRegistrationServiceLocator.getServiceBean(userRegistrationRequestModel.getUserType()).userRegistration(userRegistrationRequestModel);
    }

}
