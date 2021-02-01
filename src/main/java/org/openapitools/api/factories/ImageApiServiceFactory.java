package org.openapitools.api.factories;

import org.openapitools.api.ImageApiService;
import org.openapitools.api.impl.ImageApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:20:33.321Z[GMT]")
public class ImageApiServiceFactory {
    private static final ImageApiService service = new ImageApiServiceImpl();

    public static ImageApiService getImageApi() {
        return service;
    }
}
