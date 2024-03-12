package com.clean.crud.api.mapper;

import com.clean.crud.api.consume.message.CustomerMessage;
import com.clean.crud.core.domain.Customer;

public class KafkaMapper {

    public Customer toCustomer(CustomerMessage customerMessage){
        return new Customer(
              customerMessage.getId(),
              customerMessage.getName(),
              customerMessage.getCpf(),
              null,
              customerMessage.isValidCpf()
        );
    }
}
