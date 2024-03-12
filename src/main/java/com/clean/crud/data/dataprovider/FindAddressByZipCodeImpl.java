package com.clean.crud.data.dataprovider;

import com.clean.crud.core.domain.Address;
import com.clean.crud.core.gateway.FindAddressByZipCodeGateway;
import com.clean.crud.data.client.FindAdressByZipCodeClient;
import com.clean.crud.data.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCodeGateway {

    @Autowired
    private FindAdressByZipCodeClient findAdressByZipCodeClient;

    private AddressResponseMapper addressResponseMapper = new AddressResponseMapper();

    @Override
    public Address findByZipCode(String zipCode) {
        return addressResponseMapper.toAddress(findAdressByZipCodeClient.findAdressByZipCode(zipCode));
    }
}
