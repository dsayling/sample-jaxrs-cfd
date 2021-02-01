package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MenuApiService;
import org.openapitools.api.factories.MenuApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import org.openapitools.model.MenuItem;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/menu")


@io.swagger.annotations.Api(description = "the menu API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:20:33.321Z[GMT]")
public class MenuApi  {
   private final MenuApiService delegate;

   public MenuApi(@Context ServletConfig servletContext) {
      MenuApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MenuApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MenuApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MenuApiServiceFactory.getMenuApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a menu item", notes = "Creates a new item in the menu. Duplicates are allowed", response = Void.class, tags={ "menu", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "Null response", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class)
    })
    public Response addMenuItem(@ApiParam(value = "Item to add to the store", required = true) @NotNull @Valid  MenuItem menuItem,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addMenuItem(menuItem, securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all menu items", notes = "", response = MenuItem.class, responseContainer = "List", tags={ "menu", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A paged array of menu items", response = MenuItem.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class)
    })
    public Response listMenu(@ApiParam(value = "How many items to return at one time (max 100)") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listMenu(limit, securityContext);
    }
    @GET
    @Path("/{itemId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Info for a specific menu item", notes = "", response = MenuItem.class, tags={ "menu", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Expected response to a valid request", response = MenuItem.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class)
    })
    public Response showMenuItemById(@ApiParam(value = "The id of the menu item to retrieve", required = true) @PathParam("itemId") @NotNull  String itemId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.showMenuItemById(itemId, securityContext);
    }
}
