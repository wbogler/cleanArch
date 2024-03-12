package com.clean.crud.data;

import com.clean.crud.core.domain.Customer;
import com.clean.crud.core.gateway.InsertCustomergateway;
import com.clean.crud.data.mapper.CustomerMapper;
import com.clean.crud.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomergateway {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerMapper customerMapper = new CustomerMapper();

    @Override
    public void insertCustomer(Customer customer) {
        customerRepository.save(
                customerMapper.toCustomerEntity(customer)
        );

    }
}
