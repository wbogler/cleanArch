package com.clean.crud.core.usecase.impl;

import com.clean.crud.core.DeleteCustomerByIdUserCase;
import com.clean.crud.core.gateway.DeleteCustomerByIdGateway;
import com.clean.crud.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUserCase {

    private final DeleteCustomerByIdGateway customer;

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    public DeleteCustomerByIdUseCaseImpl(DeleteCustomerByIdGateway customer, FindCustomerByIdUseCase findCustomerByIdUseCase) {
        this.customer = customer;
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
    }

    @Override
    public void deleteCustomer(String id) {
        findCustomerByIdUseCase.findCustomerById(id);
        customer.DeleteCustomerById(id);
    }
}
