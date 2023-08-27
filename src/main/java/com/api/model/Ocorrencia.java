package com.api.model;

import java.time.LocalDateTime;

public class Ocorrencia {

    private String ufDetranBloqueio;
    private LocalDateTime dataImpedimentoBloqueio;
    private String motivoImpedimentoBloqueio;
    private String descricaoMotivoImpedimentoBloqueio;
    private Integer orgaoResponsavelImpedimentoBloqueio;
    private String documentoGeradorImpedimentoBloqueio;
    private LocalDateTime dataInicioImpedimentoBloqueio;
    private LocalDateTime dataTerminoImpedimentoBloqueio;
    private String descricaoBloqueio;
    private Integer tipoDecisaoBloqueio;
    private String descricaoDecisaoBloqueio;
    private Boolean recolhimentoCnhBloqueada;
    private String requisitosLiberacaoBloqueio;
    private Integer prazoPenalBloqueio;
    private Integer tipoPrazoPenalBloqueio;
    private String descricaoPrazoBloqueio;
    private Integer prazoPenalTotalBloqueio;
    private Integer tipoPrazoTotalBloqueio;
    private String descricaoPrazoTotalBloqueio;
    public Long id;




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
    public String getDescricaoBloqueio() {
        return descricaoBloqueio;
    }
    public void setDescricaoBloqueio(String descricaoBloqueio) {
        this.descricaoBloqueio = descricaoBloqueio;
    }
    public Integer getTipoDecisaoBloqueio() {
        return tipoDecisaoBloqueio;
    }
    public void setTipoDecisaoBloqueio(Integer tipoDecisaoBloqueio) {
        this.tipoDecisaoBloqueio = tipoDecisaoBloqueio;
    }
    public String getDescricaoDecisaoBloqueio() {
        return descricaoDecisaoBloqueio;
    }
    public void setDescricaoDecisaoBloqueio(String descricaoDecisaoBloqueio) {
        this.descricaoDecisaoBloqueio = descricaoDecisaoBloqueio;
    }
    public Boolean getRecolhimentoCnhBloqueada() {
        return recolhimentoCnhBloqueada;
    }
    public void setRecolhimentoCnhBloqueada(Boolean recolhimentoCnhBloqueada) {
        this.recolhimentoCnhBloqueada = recolhimentoCnhBloqueada;
    }
    public String getRequisitosLiberacaoBloqueio() {
        return requisitosLiberacaoBloqueio;
    }
    public void setRequisitosLiberacaoBloqueio(String requisitosLiberacaoBloqueio) {
        this.requisitosLiberacaoBloqueio = requisitosLiberacaoBloqueio;
    }
    public Integer getPrazoPenalBloqueio() {
        return prazoPenalBloqueio;
    }
    public void setPrazoPenalBloqueio(Integer prazoPenalBloqueio) {
        this.prazoPenalBloqueio = prazoPenalBloqueio;
    }
    public Integer getTipoPrazoPenalBloqueio() {
        return tipoPrazoPenalBloqueio;
    }
    public void setTipoPrazoPenalBloqueio(Integer tipoPrazoPenalBloqueio) {
        this.tipoPrazoPenalBloqueio = tipoPrazoPenalBloqueio;
    }
    public String getDescricaoPrazoBloqueio() {
        return descricaoPrazoBloqueio;
    }
    public void setDescricaoPrazoBloqueio(String descricaoPrazoBloqueio) {
        this.descricaoPrazoBloqueio = descricaoPrazoBloqueio;
    }
    public Integer getPrazoPenalTotalBloqueio() {
        return prazoPenalTotalBloqueio;
    }
    public void setPrazoPenalTotalBloqueio(Integer prazoPenalTotalBloqueio) {
        this.prazoPenalTotalBloqueio = prazoPenalTotalBloqueio;
    }
    public Integer getTipoPrazoTotalBloqueio() {
        return tipoPrazoTotalBloqueio;
    }
    public void setTipoPrazoTotalBloqueio(Integer tipoPrazoTotalBloqueio) {
        this.tipoPrazoTotalBloqueio = tipoPrazoTotalBloqueio;
    }
    public String getDescricaoPrazoTotalBloqueio() {
        return descricaoPrazoTotalBloqueio;
    }
    public void setDescricaoPrazoTotalBloqueio(String descricaoPrazoTotalBloqueio) {
        this.descricaoPrazoTotalBloqueio = descricaoPrazoTotalBloqueio;
    }


        @Override
    public String toString() {
        return "Ocorrencia [ufDetranBloqueio=" + ufDetranBloqueio + ", dataImpedimentoBloqueio="
                + dataImpedimentoBloqueio + ", motivoImpedimentoBloqueio=" + motivoImpedimentoBloqueio
                + ", descricaoMotivoImpedimentoBloqueio=" + descricaoMotivoImpedimentoBloqueio
                + ", orgaoResponsavelImpedimentoBloqueio=" + orgaoResponsavelImpedimentoBloqueio
                + ", documentoGeradorImpedimentoBloqueio=" + documentoGeradorImpedimentoBloqueio
                + ", dataInicioImpedimentoBloqueio=" + dataInicioImpedimentoBloqueio
                + ", dataTerminoImpedimentoBloqueio=" + dataTerminoImpedimentoBloqueio + ", descricaoBloqueio="
                + descricaoBloqueio + ", tipoDecisaoBloqueio=" + tipoDecisaoBloqueio + ", descricaoDecisaoBloqueio="
                + descricaoDecisaoBloqueio + ", recolhimentoCnhBloqueada=" + recolhimentoCnhBloqueada
                + ", requisitosLiberacaoBloqueio=" + requisitosLiberacaoBloqueio + ", prazoPenalBloqueio="
                + prazoPenalBloqueio + ", tipoPrazoPenalBloqueio=" + tipoPrazoPenalBloqueio
                + ", descricaoPrazoBloqueio=" + descricaoPrazoBloqueio + ", prazoPenalTotalBloqueio="
                + prazoPenalTotalBloqueio + ", tipoPrazoTotalBloqueio=" + tipoPrazoTotalBloqueio
                + ", descricaoPrazoTotalBloqueio=" + descricaoPrazoTotalBloqueio + "]";
    }
        public Object onItem() {
            return null;
        }



}

