package com.clean.crud.core.usecase.impl;

import com.clean.crud.core.domain.Customer;
import com.clean.crud.core.gateway.FindCustomerByIdgateway;
import com.clean.crud.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private FindCustomerByIdgateway customer;

    public FindCustomerByIdUseCaseImpl(FindCustomerByIdgateway customer) {
        this.customer = customer;
    }

    @Override
    public Customer findCustomerById(String id) {
        return customer.findCustomerById(id)
                .orElseThrow(()->new RuntimeException("CustomerNotFound"));
    }
}
