package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Error;
import org.openapitools.model.MenuItem;

import java.util.List;
import java.util.HashMap;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:32:28.856Z[GMT]")
public abstract class MenuApiService {
    public HashMap<Integer, Object> map;
    public MenuApiService() {
        this.map = new HashMap();
    }
    public abstract Response addMenuItem(MenuItem menuItem,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listMenu(Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response showMenuItemById(String itemId,SecurityContext securityContext) throws NotFoundException;
}
