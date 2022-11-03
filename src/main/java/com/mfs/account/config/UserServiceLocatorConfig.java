package com.mfs.account.config;

import com.mfs.account.service.registration.UserRegistrationServiceLocator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceLocatorConfig {

    @Bean(name = "user-registration-locator-factory")
    public ServiceLocatorFactoryBean getUserRegistrationLocatorFactory() {
        ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(UserRegistrationServiceLocator.class);
        return serviceLocatorFactoryBean;
    }
}
