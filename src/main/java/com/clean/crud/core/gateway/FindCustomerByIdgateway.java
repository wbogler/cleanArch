package com.clean.crud.core.gateway;

import com.clean.crud.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdgateway {

    Optional<Customer> findCustomerById(String id);
}
