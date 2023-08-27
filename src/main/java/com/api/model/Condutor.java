package com.api.model;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.mutiny.Multi;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;


@Entity
public class Condutor extends PanacheEntity {

    public String ufDominio;
    public String numeroFormularioRenach;
    public String numeroRegistro;
    public String numeroFormularioCnh;
    public String numeroListaImpedimento;
    public String nome;
    public LocalDateTime dataNascimento;
    public Integer sexo;
    public String descricaoSexo;
    public String nomeMae;
    public String nomePai;
    public Integer tipoDocumento;
    public String descricaoDocumento;
    public String numeroDocumento;
    public String orgaoExpedidorDocumento;
    public String ufExpedidorDocumento;
    public String cpf;
    public String localidadeNascimento;
    public String descricaoLocalidadeNascimento;
    public Integer nacionalidade;
    public String descricaoNacionalidade;
    public LocalDateTime dataCadastramento;
    public String enderecoLogradouro;
    public String enderecoNumero;
    public String enderecoComplemento;
    public String enderecoBairro;
    public String enderecoCep;
    public String enderecoMunicipio;
    public String descricaoEnderecoMunicipio;
    public String enderecoUf;
    public String numeroPgu;
    public String motivoRequerimento1;
    public String descricaoMotivoRequerimento1;


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


    public String getLocalidadeNascimento() {
        return localidadeNascimento;
    }


    public void setLocalidadeNascimento(String localidadeNascimento) {
        this.localidadeNascimento = localidadeNascimento;
    }


    public String getDescricaoLocalidadeNascimento() {
        return descricaoLocalidadeNascimento;
    }


    public void setDescricaoLocalidadeNascimento(String descricaoLocalidadeNascimento) {
        this.descricaoLocalidadeNascimento = descricaoLocalidadeNascimento;
    }


    public Integer getNacionalidade() {
        return nacionalidade;
    }


    public void setNacionalidade(Integer nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public String getDescricaoNacionalidade() {
        return descricaoNacionalidade;
    }


    public void setDescricaoNacionalidade(String descricaoNacionalidade) {
        this.descricaoNacionalidade = descricaoNacionalidade;
    }


    public LocalDateTime getDataCadastramento() {
        return dataCadastramento;
    }


    public void setDataCadastramento(LocalDateTime dataCadastramento) {
        this.dataCadastramento = dataCadastramento;
    }


    public String getEnderecoLogradouro() {
        return enderecoLogradouro;
    }


    public void setEnderecoLogradouro(String enderecoLogradouro) {
        this.enderecoLogradouro = enderecoLogradouro;
    }


    public String getEnderecoNumero() {
        return enderecoNumero;
    }


    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }


    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }


    public void setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }


    public String getEnderecoBairro() {
        return enderecoBairro;
    }


    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }


    public String getEnderecoCep() {
        return enderecoCep;
    }


    public void setEnderecoCep(String enderecoCep) {
        this.enderecoCep = enderecoCep;
    }


    public String getEnderecoMunicipio() {
        return enderecoMunicipio;
    }


    public void setEnderecoMunicipio(String enderecoMunicipio) {
        this.enderecoMunicipio = enderecoMunicipio;
    }


    public String getDescricaoEnderecoMunicipio() {
        return descricaoEnderecoMunicipio;
    }


    public void setDescricaoEnderecoMunicipio(String descricaoEnderecoMunicipio) {
        this.descricaoEnderecoMunicipio = descricaoEnderecoMunicipio;
    }


    public String getEnderecoUf() {
        return enderecoUf;
    }


    public void setEnderecoUf(String enderecoUf) {
        this.enderecoUf = enderecoUf;
    }


    public String getNumeroPgu() {
        return numeroPgu;
    }


    public void setNumeroPgu(String numeroPgu) {
        this.numeroPgu = numeroPgu;
    }


    public String getMotivoRequerimento1() {
        return motivoRequerimento1;
    }


    public void setMotivoRequerimento1(String motivoRequerimento1) {
        this.motivoRequerimento1 = motivoRequerimento1;
    }


    public String getDescricaoMotivoRequerimento1() {
        return descricaoMotivoRequerimento1;
    }


    public void setDescricaoMotivoRequerimento1(String descricaoMotivoRequerimento1) {
        this.descricaoMotivoRequerimento1 = descricaoMotivoRequerimento1;
    }


    public Multi<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }


    public void setOcorrencias(Multi<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }


    @OneToMany
    public Multi<Ocorrencia> ocorrencias;
}
