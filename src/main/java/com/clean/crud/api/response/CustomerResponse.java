package com.clean.crud.api.response;

import lombok.Data;

public class CustomerResponse {
    private String nome;
    private String cpf;
    private boolean isValidCpf;
    private AddresResponse addresResponse;

    public CustomerResponse(){}

    public CustomerResponse(String nome, String cpf, boolean isValidCpf, AddresResponse addresResponse) {
        this.nome = nome;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
        this.addresResponse = addresResponse;
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

    public boolean isValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(boolean validCpf) {
        isValidCpf = validCpf;
    }

    public AddresResponse getAddresResponse() {
        return addresResponse;
    }

    public void setAddresResponse(AddresResponse addresResponse) {
        this.addresResponse = addresResponse;
    }
}
