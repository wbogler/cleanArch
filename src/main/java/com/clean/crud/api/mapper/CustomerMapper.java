package com.clean.crud.api.mapper;

import com.clean.crud.api.request.CustomerRequest;
import com.clean.crud.api.response.AddresResponse;
import com.clean.crud.api.response.CustomerResponse;
import com.clean.crud.core.domain.Customer;
import com.clean.crud.data.entities.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

public class CustomerMapper {

    public Customer toCustomer (CustomerRequest customerRequest){
        return new Customer(
                null, customerRequest.getName(), customerRequest.getCpf(), null, true
        );
    }

    public CustomerResponse toCustomerResponse(Customer customer){
        return new CustomerResponse(
                customer.getNome(),
                customer.getCpf(),
                customer.isValidCpf(),
                new AddresResponse(
                        customer.getAddress().getStreet(),
                        customer.getAddress().getCity(),
                        customer.getAddress().getCountry()
                )
        );
    }
}
