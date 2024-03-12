package com.clean.crud.config;

import com.clean.crud.core.DeleteCustomerByIdUserCase;
import com.clean.crud.core.usecase.FindCustomerByIdUseCase;
import com.clean.crud.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.clean.crud.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.clean.crud.data.dataprovider.DeleteCustomerByIdGatewayImpl;
import com.clean.crud.data.dataprovider.FindCustomerByIdGatewayImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {
    @Bean
    DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, DeleteCustomerByIdGatewayImpl deleteCustomerByIdGateway
    ){
        return new DeleteCustomerByIdUseCaseImpl(deleteCustomerByIdGateway, findCustomerByIdUseCase);
    }

}
