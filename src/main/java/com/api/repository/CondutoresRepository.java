package com.api.repository;

import com.api.model.Condutor;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;

import java.util.Iterator;
import java.util.stream.Stream;

@ApplicationScoped
public class CondutoresRepository implements PanacheRepository<Condutor> {


    public Multi<Iterator<Condutor>> findAllCondutores() {
        return Multi.createFrom().items(findAll(Sort.by("nome").ascending()).list().iterator());
    }
    

    public Uni<Condutor> findByCpf(String cpf) {
        return Uni.createFrom().item(() -> find("cpf", cpf).firstResult());
    }

    public Uni<Void> addCondutor(Condutor condutor) {
        persist(condutor);
        return Uni.createFrom().voidItem();
    }

    public Uni<Condutor> updateCondutor(Condutor condutor) {
        if (condutor.id != null) {
            Condutor condutorToUpdate = findById(condutor.id);
            if (condutorToUpdate != null) {
                condutorToUpdate = condutor;
                persist(condutorToUpdate);
                return Uni.createFrom().item(condutorToUpdate);
            }
        }
        return Uni.createFrom().nullItem();
    }

    public Uni<Void> deleteCondutor(Long id) {
        deleteById(id);
        return Uni.createFrom().voidItem();
    }
}
