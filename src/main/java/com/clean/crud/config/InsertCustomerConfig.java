package com.clean.crud.config;

import com.clean.crud.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.clean.crud.data.InsertCustomerImpl;
import com.clean.crud.data.dataprovider.FindAddressByZipCodeImpl;
import com.clean.crud.data.dataprovider.SendCpfToValidationGatewayImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode, InsertCustomerImpl insertCustomer, SendCpfToValidationGatewayImpl sendCpfToValidationGateway
    ){
        return new InsertCustomerUseCaseImpl(findAddressByZipCode,insertCustomer, sendCpfToValidationGateway);
    }
}
