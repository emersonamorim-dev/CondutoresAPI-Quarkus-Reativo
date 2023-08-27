package com.api.integration;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/external-service")
@RegisterRestClient
public interface ExternalServiceClient {

    @GET
    @Path("/data")
    @Produces(MediaType.APPLICATION_JSON)
    String fetchData();
}
