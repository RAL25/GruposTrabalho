/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grupostrabalho;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
//import org.hibernate.annotations.LazyCollection;
//import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@Entity
//<editor-fold defaultstate="collapsed" desc="NamedQuerys">
@NamedQueries({
    @NamedQuery(
            name = "Pessoa.findAll",
            query = "SELECT p FROM Pessoa p"),
    @NamedQuery(
            name = "Pessoa.findNamePessoa",
            query = "SELECT DISTINCT p.nome FROM Pessoa p"),
    @NamedQuery(
            name = "Pessoa.findNameEndPessoa",
            query = "SELECT p.nome, p.endereco FROM Pessoa p"),
    @NamedQuery(
            name = "Pessoa.findPessoaAvenida",
            query = "SELECT P FROM Pessoa p WHERE p.endereco.tipoLogradouro = 1"),
    @NamedQuery(
            name = "Pessoa.findPessoaNotPraca",
            query = "SELECT P FROM Pessoa p WHERE p.endereco.tipoLogradouro = 1"),
})
//</editor-fold>
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 65)
    private String nome;

    @Column(length = 250)
    private String email;

    private LocalDate nascimento;

    @Transient
    private Byte idade;

    @OneToOne(
            cascade = CascadeType.ALL)
//            fetch = FetchType.EAGER)
//            orphanRemoval = true)
    private Endereco endereco;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
//            orphanRemoval = true)
    @JoinColumn(name = "pessoa_id")
    private List<Telefone> telefones;

    @OneToMany(
            mappedBy = "pessoa",
            cascade = CascadeType.ALL)
//            fetch = FetchType.EAGER)
    //Dependencia para lazy collection - hibernate
//    @LazyCollection(LazyCollectionOption.FALSE)
//            orphanRemoval = true)
//    @JsonbTransient
    private List<Atuacao> atuacoes;

    @OneToMany(
            mappedBy = "lider",
            cascade = CascadeType.ALL)
//            fetch = FetchType.EAGER)
    @JsonbTransient
    private List<Grupo> grupos;
    
    public Pessoa() {
        this.atuacoes = new ArrayList<>();
        this.telefones = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade() {
        this.idade = (byte) Period.between(nascimento, LocalDate.now()).getYears();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    public void setAtuacoes(List<Atuacao> atuacao) {
        this.atuacoes = atuacao;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupo) {
        this.grupos = grupo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id
                + ", nome=" + nome
                + ", email=" + email
                + ", nascimento=" + nascimento
                + ", idade=" + idade
                + ", endereco=" + endereco
                + ", telefones=" + telefones
                + ", atuacoes=" + atuacoes
                + ", grupos=" + grupos
                + '}';
    }

}
