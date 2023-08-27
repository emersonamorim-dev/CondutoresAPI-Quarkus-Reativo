package com.api.resources;

import com.api.model.Condutor;
import com.api.service.CondutoresService;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import java.util.Iterator;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/condutores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CondutoresResource {

    @Inject
    CondutoresService service;

    @GET
    public Multi<Iterator<Condutor>> getAllCondutores() {
        return service.getAllCondutores();
    }

    @GET
    @Path("/{cpf}")
    public Uni<Condutor> getCondutorByCpf(@PathParam("cpf") String cpf) {
        return service.getCondutorByCpf(cpf);
    }

    @POST
    public Uni<Condutor> addCondutor(Condutor condutor) {
        return service.addCondutor(condutor);
    }

    @PUT
    @Path("/{id}")
    public Uni<Condutor> updateCondutor(@PathParam("id") Long id, Condutor condutor) {
        condutor.id = id;
        return service.updateCondutor(condutor);
    }

    @DELETE
    @Path("/{id}")
    public Uni<Void> deleteCondutor(@PathParam("id") Long id) {
        return service.deleteCondutor(id);
    }
}
