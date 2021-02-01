package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.Error;
import java.io.File;
import org.openapitools.model.InlineResponse200;

import java.util.List;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-01T21:32:28.856Z[GMT]")
public class ImageApiServiceImpl extends ImageApiService {
    @Override
    public Response addImage(FormDataBodyPart fileNameBodypart, SecurityContext securityContext) throws NotFoundException {

        InputStream is = fileNameBodypart.getEntityAs(InputStream.class);
        Integer imageId = this.imageCounter++;
        String uploadedFileLocation = "/tmp/" + Integer.toString(imageId);
        // save it
        File  objFile=new File(uploadedFileLocation);
        if(objFile.exists())
        {
            objFile.delete();

        }
        saveToFile(is, uploadedFileLocation);

        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "imageId")).build();
    }
    @Override
    public Response deleteImage(Integer imageId, SecurityContext securityContext) throws NotFoundException {
        File f = new File("/tmp/"+imageId);
        if(f.exists())
        {
            f.delete();
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getImage(Integer imageId, SecurityContext securityContext) throws NotFoundException {
        File f = new File("/tmp/"+imageId);
        return Response.ok(f, MediaType.APPLICATION_OCTET_STREAM).build();
    }

    private void saveToFile(InputStream uploadedInputStream, String uploadedFileLocation) {
        try {
            OutputStream out = null;
            int read = 0;
            byte[] bytes = new byte[1024];
            out = new FileOutputStream(new File(uploadedFileLocation));
            while ((read = uploadedInputStream.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        }
    }
