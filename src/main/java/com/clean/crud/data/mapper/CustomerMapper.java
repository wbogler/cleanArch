package com.clean.crud.data.mapper;

import com.clean.crud.core.domain.Address;
import com.clean.crud.core.domain.Customer;
import com.clean.crud.data.entities.AddressEntity;
import com.clean.crud.data.entities.CustomerEntity;
import org.mapstruct.Mapper;

public class CustomerMapper {

    public CustomerEntity toCustomerEntity(Customer customer){
        return new CustomerEntity(
                customer.getId(),
                customer.getNome(),
                customer.getCpf(),
                new AddressEntity(
                        customer.getAddress().getStreet(), customer.getAddress().getCity(), customer.getAddress().getCountry()
                ),
                customer.isValidCpf()
        );
    }

    public Customer toCustomer(CustomerEntity customerEntity){
        return new Customer(
                customerEntity.getId(),
                customerEntity.getNome(),
                customerEntity.getCpf(),
                new Address(
                        customerEntity.getAddressEntity().getStreet(), customerEntity.getAddressEntity().getCity(), customerEntity.getAddressEntity().getCountry()
                ),
                customerEntity.isValidCpf()
        );
    }

}
