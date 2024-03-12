package com.clean.crud.core.usecase.impl;

import com.clean.crud.core.domain.Customer;
import com.clean.crud.core.gateway.FindAddressByZipCodeGateway;
import com.clean.crud.core.gateway.InsertCustomergateway;
import com.clean.crud.core.gateway.SendCpfToValidationGateway;
import com.clean.crud.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCodeGateway findAddressByZipCodeGateway;

    private final InsertCustomergateway insertCustomergateway;

    private final SendCpfToValidationGateway sendCpfToValidationGateway;

    public InsertCustomerUseCaseImpl(FindAddressByZipCodeGateway findAddressByZipCodeGateway, InsertCustomergateway insertCustomergateway, SendCpfToValidationGateway sendCpfToValidationGateway) {
        this.findAddressByZipCodeGateway = findAddressByZipCodeGateway;
        this.insertCustomergateway = insertCustomergateway;
        this.sendCpfToValidationGateway = sendCpfToValidationGateway;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeGateway.findByZipCode(zipCode);
        customer.setAddress(address);
        insertCustomergateway.insertCustomer(customer);
        sendCpfToValidationGateway.send(customer.getCpf());
    }
}
