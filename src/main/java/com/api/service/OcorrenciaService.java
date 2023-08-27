package com.api.service;

import com.api.model.Ocorrencia;
import com.api.repository.OcorrenciaRepository;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class OcorrenciaService {

    @Inject
    OcorrenciaRepository repository;

    public Multi<Ocorrencia> getAllOcorrencias() {
        return repository.findAllOcorrencias();
    }

    public Uni<Ocorrencia> getOcorrenciaByDocumentoGerador(String documento) {
        return repository.findByDocumentoGerador(documento);
    }

    public Uni<Void> addOcorrencia(Ocorrencia ocorrencia) {
        return repository.addOcorrencia(ocorrencia);
    }

    public Uni<Ocorrencia> updateOcorrencia(Ocorrencia ocorrencia) {
        return repository.updateOcorrencia(ocorrencia);
    }

    public Uni<Void> deleteOcorrencia(Long id) {
        return repository.deleteOcorrencia(id);
    }
}
