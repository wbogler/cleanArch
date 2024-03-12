package com.clean.crud.data.entities;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private String id;
    private String nome;
    private String cpf;
    private AddressEntity addressEntity;
    private boolean isValidCpf;

    public CustomerEntity(){}

    public CustomerEntity(String id, String nome, String cpf, AddressEntity addressEntity, boolean isValidCpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.addressEntity = addressEntity;
        this.isValidCpf = isValidCpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public boolean isValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(boolean validCpf) {
        isValidCpf = validCpf;
    }
}
