package com.clean.crud.core.usecase;

import com.clean.crud.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
