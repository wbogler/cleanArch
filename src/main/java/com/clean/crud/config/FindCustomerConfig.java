package com.clean.crud.config;

import com.clean.crud.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.clean.crud.data.dataprovider.FindCustomerByIdGatewayImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerConfig {

    @Bean
    FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdGatewayImpl findCustomerByIdGateway
    ){
        return new FindCustomerByIdUseCaseImpl(findCustomerByIdGateway);
    }
}
