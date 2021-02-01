package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Error;
import org.openapitools.model.MenuItem;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:32:28.856Z[GMT]")
public abstract class CartApiService {
    public abstract Response addCartItem(MenuItem menuItem,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteCartItem(Integer itemId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listCart(Integer limit,SecurityContext securityContext) throws NotFoundException;
}
