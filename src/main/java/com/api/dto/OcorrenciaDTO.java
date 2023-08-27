package com.api.dto;

import java.time.LocalDateTime;

public class OcorrenciaDTO {
        private String ufDetranBloqueio;
        private LocalDateTime dataImpedimentoBloqueio;
        private String motivoImpedimentoBloqueio;
        private String descricaoMotivoImpedimentoBloqueio;
        private Integer orgaoResponsavelImpedimentoBloqueio;
        private String documentoGeradorImpedimentoBloqueio;
        private LocalDateTime dataInicioImpedimentoBloqueio;
        private LocalDateTime dataTerminoImpedimentoBloqueio;
        
        public String getUfDetranBloqueio() {
            return ufDetranBloqueio;
        }
        public void setUfDetranBloqueio(String ufDetranBloqueio) {
            this.ufDetranBloqueio = ufDetranBloqueio;
        }
        public LocalDateTime getDataImpedimentoBloqueio() {
            return dataImpedimentoBloqueio;
        }
        public void setDataImpedimentoBloqueio(LocalDateTime dataImpedimentoBloqueio) {
            this.dataImpedimentoBloqueio = dataImpedimentoBloqueio;
        }
        public String getMotivoImpedimentoBloqueio() {
            return motivoImpedimentoBloqueio;
        }
        public void setMotivoImpedimentoBloqueio(String motivoImpedimentoBloqueio) {
            this.motivoImpedimentoBloqueio = motivoImpedimentoBloqueio;
        }
        public String getDescricaoMotivoImpedimentoBloqueio() {
            return descricaoMotivoImpedimentoBloqueio;
        }
        public void setDescricaoMotivoImpedimentoBloqueio(String descricaoMotivoImpedimentoBloqueio) {
            this.descricaoMotivoImpedimentoBloqueio = descricaoMotivoImpedimentoBloqueio;
        }
        public Integer getOrgaoResponsavelImpedimentoBloqueio() {
            return orgaoResponsavelImpedimentoBloqueio;
        }
        public void setOrgaoResponsavelImpedimentoBloqueio(Integer orgaoResponsavelImpedimentoBloqueio) {
            this.orgaoResponsavelImpedimentoBloqueio = orgaoResponsavelImpedimentoBloqueio;
        }
        public String getDocumentoGeradorImpedimentoBloqueio() {
            return documentoGeradorImpedimentoBloqueio;
        }
        public void setDocumentoGeradorImpedimentoBloqueio(String documentoGeradorImpedimentoBloqueio) {
            this.documentoGeradorImpedimentoBloqueio = documentoGeradorImpedimentoBloqueio;
        }
        public LocalDateTime getDataInicioImpedimentoBloqueio() {
            return dataInicioImpedimentoBloqueio;
        }
        public void setDataInicioImpedimentoBloqueio(LocalDateTime dataInicioImpedimentoBloqueio) {
            this.dataInicioImpedimentoBloqueio = dataInicioImpedimentoBloqueio;
        }
        public LocalDateTime getDataTerminoImpedimentoBloqueio() {
            return dataTerminoImpedimentoBloqueio;
        }
        public void setDataTerminoImpedimentoBloqueio(LocalDateTime dataTerminoImpedimentoBloqueio) {
            this.dataTerminoImpedimentoBloqueio = dataTerminoImpedimentoBloqueio;
        }

    }






