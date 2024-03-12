package com.clean.crud.data.client;

import com.clean.crud.data.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FindAdressByZipCodeClient", url = "${bogler.client.address.url}")
public interface FindAdressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse findAdressByZipCode(@PathVariable String zipCode);
}
