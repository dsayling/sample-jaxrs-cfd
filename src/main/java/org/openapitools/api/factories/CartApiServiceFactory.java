package org.openapitools.api.factories;

import org.openapitools.api.CartApiService;
import org.openapitools.api.impl.CartApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:20:33.321Z[GMT]")
public class CartApiServiceFactory {
    private static final CartApiService service = new CartApiServiceImpl();

    public static CartApiService getCartApi() {
        return service;
    }
}
