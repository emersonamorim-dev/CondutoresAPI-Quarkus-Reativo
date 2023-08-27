package com.api.resources;

import com.api.model.Ocorrencia;
import com.api.service.OcorrenciaService;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ocorrencias")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OcorrenciaResource {

    @Inject
    OcorrenciaService service;

    @GET
    public Multi<Ocorrencia> getAll() {
        return service.getAllOcorrencias();
    }

    @GET
    @Path("/{documento}")
    public Uni<Ocorrencia> getByDocumento(@PathParam("documento") String documento) {
        return service.getOcorrenciaByDocumentoGerador(documento);
    }

    @POST
    public Uni<Response> add(Ocorrencia ocorrencia) {
        return service.addOcorrencia(ocorrencia)
                .onItem().transform(ignore -> Response.status(Response.Status.CREATED).build());
    }

    @PUT
    public Uni<Ocorrencia> update(Ocorrencia ocorrencia) {
        return service.updateOcorrencia(ocorrencia);
    }

    @DELETE
    @Path("/{id}")
    public Uni<Response> delete(@PathParam("id") Long id) {
        return service.deleteOcorrencia(id)
                .onItem().transform(ignore -> Response.noContent().build());
    }
}
