package com.clean.crud.api.controller;

import com.clean.crud.api.mapper.CustomerMapper;
import com.clean.crud.api.request.CustomerRequest;
import com.clean.crud.api.response.CustomerResponse;
import com.clean.crud.core.DeleteCustomerByIdUserCase;
import com.clean.crud.core.usecase.FindCustomerByIdUseCase;
import com.clean.crud.core.usecase.InsertCustomerUseCase;
import com.clean.crud.core.usecase.UpdateCustomerUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUsecase updateCustomerUsecase;

    private CustomerMapper customerMapper = new CustomerMapper();

    @Autowired
    private DeleteCustomerByIdUserCase deleteCustomerByIdUserCase;

    @PostMapping
    public ResponseEntity<String> insertCustomer(@RequestBody CustomerRequest customer){
        insertCustomerUseCase.insert(
                customerMapper.toCustomer(customer),customer.getZipCode()
        );
        return ResponseEntity.ok("tudo certo");
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findCustomerById(@PathVariable String id){
        return ResponseEntity.ok(
                customerMapper.toCustomerResponse(
                        findCustomerByIdUseCase.findCustomerById(id)
                )
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCustomer(@PathVariable final String id, @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUsecase.updateCustomer(
                customer,customerRequest.getZipCode()
        );
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id){
        deleteCustomerByIdUserCase.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }
}
