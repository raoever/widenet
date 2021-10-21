package com.rene.cepservice;

import javax.enterprise.context.Dependent;
import javax.ws.rs.client.WebTarget;

@Dependent
public class WideNet extends AbstractCepService {

    private static final String DOMINIO = "https://apps.widenet.com.br/";

    public WideNet() {
        super(DOMINIO);
    }

    @Override
    protected WebTarget buildPath(final String cep) {
        return super.buildPath("busca-cep/api/cep.json?code=" + cep);
    }
}
