package com.api.integration;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import javax.enterprise.context.ApplicationScoped;
import java.net.URI;

@ApplicationScoped
public class EBSConnector {

    private final ExternalServiceClient client;

    public EBSConnector() {
        String baseUrl = "http://external-service-url"; // Substitua por sua URL real
        client = RestClientBuilder.newBuilder()
                .baseUri(URI.create(baseUrl))
                .build(ExternalServiceClient.class);
    }

    public String fetchDataFromService() {
        return client.fetchData();
    }
}
