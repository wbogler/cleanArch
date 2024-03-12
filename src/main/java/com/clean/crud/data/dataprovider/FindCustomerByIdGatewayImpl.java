package com.clean.crud.data.dataprovider;

import com.clean.crud.core.domain.Customer;
import com.clean.crud.core.gateway.FindCustomerByIdgateway;
import com.clean.crud.data.mapper.CustomerMapper;
import com.clean.crud.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdGatewayImpl implements FindCustomerByIdgateway {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerMapper customerMapper = new CustomerMapper();

    @Override
    public Optional<Customer> findCustomerById(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerMapper.toCustomer(entity));
    }
}
