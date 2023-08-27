package com.api.service;

import com.api.model.Condutor;
import com.api.repository.CondutoresRepository;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import java.util.Iterator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CondutoresService {

    @Inject
    CondutoresRepository repository;

    public Multi<Iterator<Condutor>> getAllCondutores() {
        return repository.findAllCondutores();
    }

    public Uni<Condutor> getCondutorByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    public Uni<Condutor> addCondutor(Condutor condutor) {
        return repository.addCondutor(condutor)
                .onItem().transform(ignore -> condutor);
    }

    public Uni<Condutor> updateCondutor(Condutor condutor) {
        return repository.updateCondutor(condutor)
                .onItem().ifNotNull().transform(updatedCondutor -> condutor);
    }

    public Uni<Void> deleteCondutor(Long id) {
        return repository.deleteCondutor(id);
    }
}
