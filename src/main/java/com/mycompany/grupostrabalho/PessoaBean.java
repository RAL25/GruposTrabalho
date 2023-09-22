/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package com.mycompany.grupostrabalho;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@Stateless
public class PessoaBean implements PessoaBeanLocal {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void salvar(Pessoa pessoa) {
        entityManager.persist(pessoa);
    }
    
    
}
