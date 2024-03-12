package com.clean.crud.core.usecase.impl;

import com.clean.crud.core.domain.Customer;
import com.clean.crud.core.gateway.FindAddressByZipCodeGateway;
import com.clean.crud.core.gateway.UpdateCustomerGateway;
import com.clean.crud.core.usecase.FindCustomerByIdUseCase;
import com.clean.crud.core.usecase.UpdateCustomerUsecase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUsecase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final FindAddressByZipCodeGateway findAddressByZipCodeGateway;

    private final UpdateCustomerGateway updateCustomerGateway;

    public UpdateCustomerUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCodeGateway findAddressByZipCodeGateway, UpdateCustomerGateway updateCustomerGateway) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCodeGateway = findAddressByZipCodeGateway;
        this.updateCustomerGateway = updateCustomerGateway;
    }

    @Override
    public void updateCustomer(Customer customer, String zipCode) {
        findCustomerByIdUseCase.findCustomerById(customer.getId());
        var address = findAddressByZipCodeGateway.findByZipCode(zipCode);
        customer.setAddress(address);
        updateCustomerGateway.updateCustomer(customer);
    }
}
