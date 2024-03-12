package com.clean.crud.data.dataprovider;

import com.clean.crud.core.gateway.SendCpfToValidationGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfToValidationGatewayImpl implements SendCpfToValidationGateway {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);

    }
}
