package com.clean.crud.data.mapper;

import com.clean.crud.core.domain.Address;
import com.clean.crud.data.client.response.AddressResponse;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

public class AddressResponseMapper {

    public Address toAddress(AddressResponse addressResponse){
        return new Address(
                addressResponse.getStreet(), addressResponse.getCity(), addressResponse.getCountry()
        );
    }

}
