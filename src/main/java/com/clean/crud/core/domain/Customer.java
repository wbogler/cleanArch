package com.clean.crud.core.domain;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

public class Customer {

    private String id;
    private String nome;
    private String cpf;
    private Address address;
    private boolean isValidCpf;

    public Customer(){
        this.isValidCpf = false;
    }

    public Customer(String id, String nome, String cpf, Address address, boolean isValidCpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(boolean validCpf) {
        isValidCpf = validCpf;
    }
}
