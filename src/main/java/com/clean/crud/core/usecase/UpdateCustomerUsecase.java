package com.clean.crud.core.usecase;

import com.clean.crud.core.domain.Customer;

public interface UpdateCustomerUsecase {

    void updateCustomer (Customer customer, String zipCode);
}
