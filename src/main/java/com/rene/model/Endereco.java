package com.rene.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAlias;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Endereco {
    @JsonAlias ({"logradouro", "address"})
    private String logradouro;
    private String complemento;
    @JsonAlias ({"bairro", "district"})
    private String bairro;
    @JsonAlias({"localidade", "city"})
    private String localicade;
    @JsonAlias({"uf", "state"})
    private String uf;
    @JsonAlias({"cep", "code"})
    private String cep;


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalicade() {
        return localicade;
    }

    public void setLocalicade(String localicade) {
        this.localicade = localicade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
