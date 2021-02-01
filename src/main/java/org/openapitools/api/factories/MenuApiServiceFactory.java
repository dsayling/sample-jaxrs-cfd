package org.openapitools.api.factories;

import org.openapitools.api.MenuApiService;
import org.openapitools.api.impl.MenuApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:32:28.856Z[GMT]")
public class MenuApiServiceFactory {
    private static final MenuApiService service = new MenuApiServiceImpl();

    public static MenuApiService getMenuApi() {
        return service;
    }
}
