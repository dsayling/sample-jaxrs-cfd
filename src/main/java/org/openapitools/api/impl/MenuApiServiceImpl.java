package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.Error;
import org.openapitools.model.MenuItem;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:32:28.856Z[GMT]")
public class MenuApiServiceImpl extends MenuApiService {
    @Override
    public Response addMenuItem(MenuItem menuItem, SecurityContext securityContext) throws NotFoundException {
        this.map.put(menuItem.getId(), menuItem);
        return Response.ok().build();
    }
    @Override
    public Response listMenu(Integer limit, SecurityContext securityContext) throws NotFoundException {
        // support limit
        ArrayList<MenuItem> retArray = new ArrayList<MenuItem>();
        for (Integer i : this.map.keySet()){
            retArray.add((MenuItem)this.map.get(i));
        }
        return Response.ok(retArray, MediaType.APPLICATION_JSON).build();
    }
    @Override
    public Response showMenuItemById(String itemId, SecurityContext securityContext) throws NotFoundException {
        return Response.ok(this.map.get(Integer.parseInt(itemId)), MediaType.APPLICATION_JSON).build();
    }
}
