package com.rene.cepservice;

import com.rene.model.Endereco;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.util.Objects;
import java.util.logging.Logger;

public abstract class AbstractCepService implements CepService {
    private final static Logger LOGGER = Logger.getLogger(CepService.class.getSimpleName());
    private final String dominio;
    private final Client client;

    protected AbstractCepService(final String dominio) { //
        this.dominio = insertTrailingSlash(Objects.requireNonNull(dominio));
        this.client = ClientBuilder.newClient();
    }

    private String insertTrailingSlash(final String url) { //
        return url.endsWith("/") ? url : url + "/";
    }

    protected WebTarget buildPath(String caminho) { //
        return client.target(dominio + caminho);
    }

    private String getFullPath(final String cep){ //
        return dominio + buildPath(cep);
    }

    @Override
    public Endereco buscaEndereco(final String cep) { //
        Objects.requireNonNull(cep, "CEP não pode ser nulo");
        LOGGER.info("Enviando requisição para " + getFullPath(cep));

        return buildPath(cep).request().get(Endereco.class);
    }
}
