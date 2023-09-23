/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grupostrabalho;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@Entity
@Table(name = "tbl_grupo")
public class Grupo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 65)
    private String nome;

    private Boolean ativo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tbl_pessoa")
    private Pessoa lider;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tbl_pessoa")
    private List<Pessoa> membros;

    @OneToMany(mappedBy = "grupo",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Atuacao> atuacao;

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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Pessoa getLider() {
        return lider;
    }

    public void setLider(Pessoa lider) {
        this.lider = lider;
    }

    public List<Pessoa> getMembros() {
        return membros;
    }

    public void setMembros(List<Pessoa> membros) {
        this.membros = membros;
    }

    public List<Atuacao> getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(List<Atuacao> atuacao) {
        this.atuacao = atuacao;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id
                + ", nome=" + nome
                + ", ativo=" + ativo
                + ", lider=" + lider
                + ", membros=" + membros
                + ", atuacao=" + atuacao + '}';
    }

}
