package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Error;
import java.io.File;
import org.openapitools.model.InlineResponse200;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:20:33.321Z[GMT]")
public abstract class ImageApiService {
    public abstract Response addImage(FormDataBodyPart fileNameBodypart,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteImage(Integer imageId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getImage(Integer imageId,SecurityContext securityContext) throws NotFoundException;
}
