package com.clean.crud.data.dataprovider;

import com.clean.crud.core.domain.Customer;
import com.clean.crud.core.gateway.UpdateCustomerGateway;
import com.clean.crud.data.mapper.CustomerMapper;
import com.clean.crud.data.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomerGateway {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerMapper customerMapper = new CustomerMapper();

    @Override
    public void updateCustomer(Customer customer) {

        customerRepository.save(
                customerMapper.toCustomerEntity(customer)
        );
    }
}
