package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.Error;
import org.openapitools.model.MenuItem;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;
import java.lang.reflect.Array;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:32:28.856Z[GMT]")
public class CartApiServiceImpl extends CartApiService {

    @Override
    public Response addCartItem(MenuItem menuItem, SecurityContext securityContext) throws NotFoundException {
        this.array.add(menuItem);
        return Response.ok().build();
    }
    @Override
    public Response deleteCartItem(Integer itemId, SecurityContext securityContext) throws NotFoundException {
        // setup error codes/handling if itemId does not exist
        for (int i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getId() == itemId){
                this.array.remove(i);
            }
        }
        return Response.ok().build();
    }
    @Override
    public Response listCart(Integer limit, SecurityContext securityContext) throws NotFoundException {
        return Response.ok(this.array, MediaType.APPLICATION_JSON).build();
    }
}
