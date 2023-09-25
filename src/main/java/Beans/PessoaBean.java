/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package Beans;

import com.mycompany.grupostrabalho.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@Stateless
public class PessoaBean implements PessoaBeanLocal {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void salvarP(Pessoa pessoa) {
        entityManager.persist(pessoa);
    }
    
    @Override
    public List<Pessoa> findAllPessoa() {
        Query q = entityManager.createQuery(
                "SELECT p FROM Pessoa p");
        return (List<Pessoa>) q.getResultList();
//        return q.getResultList();
    }
    
    @Override
    public List<Pessoa> findAllPessoaTyped() {
        TypedQuery<Pessoa> typedQuery = entityManager.
                createQuery("SELECT p FROM Pessoa p", Pessoa.class);
        return (List<Pessoa>) typedQuery.getResultList();
    }
    
    @Override
    public List<Pessoa> findAllPessoaNamed() {
        return entityManager.createNamedQuery("Pessoa.findAll", Pessoa.class).getResultList();
    }
    
    @Override
    public List<Pessoa>  findNamePessoaQuery() {
        Query query = entityManager
                .createQuery(
                        "SELECT DISTINCT p.nome  "
                                + "FROM Pessoa p");
        // Parâmetro indexado
//        query.setParameter(1, id);
        return (List<Pessoa>)  query.getResultList();
    } 
    
    @Override
    public List<String> findNamePessoaTyped() {
        TypedQuery<String> typedQuery = entityManager.
                createQuery("SELECT p.nome FROM Pessoa p", String.class);
        return (List<String>) typedQuery.getResultList();
    }
    
    @Override
    public List<String> findNamePessoaNamed() {
        return entityManager.createNamedQuery("Pessoa.findNamePessoa", String.class).getResultList();
    }
    
    @Override
    public List<Pessoa>  findNameEndPessoaQuery() {
        Query query = entityManager
                .createQuery(
                        "SELECT p.nome, p.endereco"
                                + " FROM Pessoa p");
        // Parâmetro indexado
//        query.setParameter(1, id);
        return (List<Pessoa>)  query.getResultList();
    } 
    
    @Override
    public List<Pessoa> findNameEndPessoaTyped() {
        TypedQuery<Pessoa> typedQuery = entityManager.
                createQuery("SELECT p.nome, p.endereco FROM Pessoa p", Pessoa.class);
        return (List<Pessoa>) typedQuery.getResultList();
    }
    
    @Override
    public List<Pessoa> findNameEndPessoaNamed() {
        return entityManager.createNamedQuery("Pessoa.findNamePessoa", Pessoa.class).getResultList();
    }
    
}
