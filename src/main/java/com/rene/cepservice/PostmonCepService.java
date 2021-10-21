package com.rene.cepservice;

import javax.enterprise.context.Dependent;
import javax.ws.rs.client.WebTarget;

//@Dependent
public class PostmonCepService extends AbstractCepService {
    public PostmonCepService() {
        super("https://api.postmon.com.br");
    }

    protected WebTarget buildPath(final String cep) {
        return super.buildPath("v1/cep/" + cep);
    }
}
