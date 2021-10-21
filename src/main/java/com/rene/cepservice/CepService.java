package com.rene.cepservice;

import com.rene.model.Endereco;

public interface CepService {
    Endereco buscaEndereco(String cep);
}
