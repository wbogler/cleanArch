package com.clean.crud.api.consume;

import com.clean.crud.api.consume.message.CustomerMessage;
import com.clean.crud.api.mapper.KafkaMapper;
import com.clean.crud.core.usecase.UpdateCustomerUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceivedValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerUsecase updateCustomerUsecase;

    private KafkaMapper kafkaMapper = new KafkaMapper();

    @KafkaListener(topics = "tp-cpf-validated", groupId = "willian")
    public void receive(CustomerMessage customerMessage){
        var customer = kafkaMapper.toCustomer(customerMessage);
        updateCustomerUsecase.updateCustomer(customer, customerMessage.getZipCode());

    }
}
