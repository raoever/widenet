package com.rene.cepservice;

import javax.enterprise.context.Dependent;
import javax.ws.rs.client.WebTarget;

//@Dependent
public class ViaCepService extends AbstractCepService {
    public ViaCepService() {
        super("https://viacep.com.br/");
    }

    @Override
    protected WebTarget buildPath(final String cep) {
        return super.buildPath("ws/" + cep + "/json");
    }
}
