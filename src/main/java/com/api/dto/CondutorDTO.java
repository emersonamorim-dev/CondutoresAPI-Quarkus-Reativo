package com.api.dto;

import java.time.LocalDateTime;

import io.smallrye.mutiny.Multi;

public class CondutorDTO {

    private String ufDominio;
    private String numeroFormularioRenach;
    private String numeroRegistro;
    private String numeroFormularioCnh;
    private String numeroListaImpedimento;
    private String nome;
    private LocalDateTime dataNascimento;
    private Integer sexo;
    private String descricaoSexo;
    private String nomeMae;
    private String nomePai;
    private Integer tipoDocumento;
    private String descricaoDocumento;
    private String numeroDocumento;
    private String orgaoExpedidorDocumento;
    private String ufExpedidorDocumento;
    private String cpf;

    public String getUfDominio() {
        return ufDominio;
    }

    public void setUfDominio(String ufDominio) {
        this.ufDominio = ufDominio;
    }

    public String getNumeroFormularioRenach() {
        return numeroFormularioRenach;
    }

    public void setNumeroFormularioRenach(String numeroFormularioRenach) {
        this.numeroFormularioRenach = numeroFormularioRenach;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNumeroFormularioCnh() {
        return numeroFormularioCnh;
    }

    public void setNumeroFormularioCnh(String numeroFormularioCnh) {
        this.numeroFormularioCnh = numeroFormularioCnh;
    }

    public String getNumeroListaImpedimento() {
        return numeroListaImpedimento;
    }

    public void setNumeroListaImpedimento(String numeroListaImpedimento) {
        this.numeroListaImpedimento = numeroListaImpedimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public String getDescricaoSexo() {
        return descricaoSexo;
    }

    public void setDescricaoSexo(String descricaoSexo) {
        this.descricaoSexo = descricaoSexo;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDescricaoDocumento() {
        return descricaoDocumento;
    }

    public void setDescricaoDocumento(String descricaoDocumento) {
        this.descricaoDocumento = descricaoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getOrgaoExpedidorDocumento() {
        return orgaoExpedidorDocumento;
    }

    public void setOrgaoExpedidorDocumento(String orgaoExpedidorDocumento) {
        this.orgaoExpedidorDocumento = orgaoExpedidorDocumento;
    }

    public String getUfExpedidorDocumento() {
        return ufExpedidorDocumento;
    }

    public void setUfExpedidorDocumento(String ufExpedidorDocumento) {
        this.ufExpedidorDocumento = ufExpedidorDocumento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Multi<OcorrenciaDTO> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(Multi<OcorrenciaDTO> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    private Multi<OcorrenciaDTO> ocorrencias;

}