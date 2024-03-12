package com.clean.crud.config;

import com.clean.crud.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.clean.crud.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.clean.crud.data.dataprovider.FindAddressByZipCodeImpl;
import com.clean.crud.data.dataprovider.FindCustomerByIdGatewayImpl;
import com.clean.crud.data.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, FindAddressByZipCodeImpl findAddressByZipCode, UpdateCustomerImpl updateCustomer
    ){
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode,updateCustomer);
    }

}
