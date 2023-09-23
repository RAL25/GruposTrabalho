/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grupostrabalho;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@Entity
@Table(name = "tbl_pessoa")
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

    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Telefone> telefones;

    @OneToMany(mappedBy = "pessoa",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Atuacao> atuacao;

    @OneToMany(mappedBy = "pessoa",
            cascade = CascadeType.ALL)
    private List<Grupo> grupo;
    
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
        return atuacao;
    }

    public void setAtuacoes(List<Atuacao> atuacao) {
        this.atuacao = atuacao;
    }

    public List<Grupo> getGrupos() {
        return grupo;
    }

    public void setGrupos(List<Grupo> grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + 
                ", nome=" + nome + 
                ", email=" + email + 
                ", nascimento=" + nascimento + 
                ", idade=" + idade + 
                ", endereco=" + endereco + 
                ", telefones=" + telefones + 
                ", atuacoes=" + atuacao + 
                ", grupos=" + grupo + 
                '}';
    }
    
    
}
