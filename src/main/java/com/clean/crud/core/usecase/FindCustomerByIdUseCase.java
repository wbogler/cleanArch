package com.clean.crud.core.usecase;

import com.clean.crud.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer findCustomerById(String id);
}
