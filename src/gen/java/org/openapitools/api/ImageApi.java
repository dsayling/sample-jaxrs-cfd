package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ImageApiService;
import org.openapitools.api.factories.ImageApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import java.io.File;
import org.openapitools.model.InlineResponse200;

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

@Path("/image")


@io.swagger.annotations.Api(description = "the image API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:32:28.856Z[GMT]")
public class ImageApi  {
   private final ImageApiService delegate;

   public ImageApi(@Context ServletConfig servletContext) {
      ImageApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ImageApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ImageApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ImageApiServiceFactory.getImageApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add an image to the restaraunt", notes = "Creates an image. Duplicates are allowed. Returns the image id", response = InlineResponse200.class, tags={ "image", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse200.class)
    })
    public Response addImage(
 @FormDataParam("fileName") FormDataBodyPart fileNameBodypart ,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addImage(fileNameBodypart, securityContext);
    }
    @DELETE
    @Path("/{imageId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove image", notes = "The imageId must exist ", response = Void.class, tags={ "image", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "Null response", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class)
    })
    public Response deleteImage(@ApiParam(value = "The imageId to delete", required = true) @PathParam("imageId") @NotNull  Integer imageId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteImage(imageId, securityContext);
    }
    @GET
    @Path("/{imageId}")
    
    @Produces({ "image/png" })
    @io.swagger.annotations.ApiOperation(value = "Get image", notes = "Returns the image as image/png ", response = File.class, tags={ "image", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "image", response = File.class)
    })
    public Response getImage(@ApiParam(value = "The imageId of the image to retrieve", required = true) @PathParam("imageId") @NotNull  Integer imageId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getImage(imageId, securityContext);
    }
}
