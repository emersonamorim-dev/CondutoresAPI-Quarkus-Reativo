package com.api.repository;

import com.api.model.Ocorrencia;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OcorrenciaRepository implements PanacheRepositoryBase<Ocorrencia, Long> {

    public Multi<Ocorrencia> findAllOcorrencias() {
        return Multi.createFrom().items(findAll().list()::stream);
    }

    public Uni<Ocorrencia> findByDocumentoGerador(String documento) {
        return find("documentoGeradorImpedimentoBloqueio", documento).firstResult();
    }

    public Uni<Void> addOcorrencia(Ocorrencia ocorrencia) {
        persist(ocorrencia);
        return Uni.createFrom().voidItem();
    }

    public Uni<Ocorrencia> updateOcorrencia(Ocorrencia ocorrencia) {
        if (ocorrencia.id != null) {
            return Uni.createFrom().item(findById(ocorrencia.id))
                    .onItem().ifNotNull().transformToUni(existingOcorrencia -> {
                        existingOcorrencia = ocorrencia;
                        persist(existingOcorrencia);
                        return Uni.createFrom().item(existingOcorrencia);
                    });
        }
        return Uni.createFrom().nullItem();
    }
    
    

    public Uni<Void> deleteOcorrencia(Long id) {
        boolean deleted = deleteById(id);
        if (deleted) {
            return Uni.createFrom().voidItem();
        } else {
            return Uni.createFrom().failure(new IllegalArgumentException("Ocorrencia não encontrada"));
        }
    }
}
