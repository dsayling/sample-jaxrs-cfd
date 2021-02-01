package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CartApiService;
import org.openapitools.api.factories.CartApiServiceFactory;

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

@Path("/cart")


@io.swagger.annotations.Api(description = "the cart API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:20:33.321Z[GMT]")
public class CartApi  {
   private final CartApiService delegate;

   public CartApi(@Context ServletConfig servletContext) {
      CartApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CartApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CartApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CartApiServiceFactory.getCartApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a menu item a cart", notes = "Creates a new item in the cart. Duplicates are allowed", response = Void.class, tags={ "cart", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "Null response", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class)
    })
    public Response addCartItem(@ApiParam(value = "Item to add to the cart", required = true) @NotNull @Valid  MenuItem menuItem,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addCartItem(menuItem, securityContext);
    }
    @DELETE
    @Path("/{itemId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove item from cart", notes = "The item must be in the cart. If multiple of same item, call this twice ", response = Void.class, tags={ "cart", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "Null response", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class)
    })
    public Response deleteCartItem(@ApiParam(value = "The menu item to delete from cart", required = true) @PathParam("itemId") @NotNull  Integer itemId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteCartItem(itemId, securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all cart items", notes = "", response = MenuItem.class, responseContainer = "List", tags={ "cart", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A paged array of cart items", response = MenuItem.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class)
    })
    public Response listCart(@ApiParam(value = "How many items to return at one time (max 100)") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listCart(limit, securityContext);
    }
}
