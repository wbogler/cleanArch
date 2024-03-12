package com.clean.crud.core.gateway;

import com.clean.crud.core.domain.Address;

public interface FindAddressByZipCodeGateway {

    Address findByZipCode(final String zipCode);
}
