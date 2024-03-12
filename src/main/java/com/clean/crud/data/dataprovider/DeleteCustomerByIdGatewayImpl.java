package com.clean.crud.data.dataprovider;

import com.clean.crud.core.gateway.DeleteCustomerByIdGateway;
import com.clean.crud.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdGatewayImpl implements DeleteCustomerByIdGateway {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void DeleteCustomerById(String id) {
        customerRepository.deleteById(id);
    }
}
