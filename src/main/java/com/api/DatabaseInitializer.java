package com.api;

import io.vertx.mutiny.pgclient.PgPool;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class DatabaseInitializer {

    @Inject
    PgPool client;

    public void onStart(@Observes StartupEvent ev) {
        initDb();
    }

    private void initDb() {
        // Crie a tabela Condutores
        String createCondutoresTableSql = "CREATE TABLE IF NOT EXISTS condutores (" +
                                          "id SERIAL PRIMARY KEY," +
                                          "nome VARCHAR(255)," +
                                          "cpf VARCHAR(11)" +
                     
                                          ");"; 
        client.query(createCondutoresTableSql).execute()
            .await().indefinitely();

        // Crie a tabela Ocorrencia
        String createOcorrenciaTableSql = "CREATE TABLE IF NOT EXISTS ocorrencias (" +
                                          "id SERIAL PRIMARY KEY," +
                                          "descricaoBloqueio VARCHAR(255)," +
                                          "documentoGeradorImpedimentoBloqueio VARCHAR(255)" +
           
                                          ");"; 
        client.query(createOcorrenciaTableSql).execute()
            .await().indefinitely();

        // Insira dados iniciais para Condutores
        String insertCondutoresDataSql = "INSERT INTO condutores (nome, cpf) VALUES ('Emerson Amorim', '12345678901');"; 
        client.query(insertCondutoresDataSql).execute()
            .await().indefinitely();

        // Insira dados iniciais para Ocorrencia
        String insertOcorrenciaDataSql = "INSERT INTO ocorrencias (descricaoBloqueio, documentoGeradorImpedimentoBloqueio) VALUES ('Exemplo Bloqueio', '12345678');"; 
        client.query(insertOcorrenciaDataSql).execute()
            .await().indefinitely();
    }
}

