/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package Beans;

import com.mycompany.grupostrabalho.Pessoa;
import java.time.LocalDate;
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

    //<-------------Persistência para salvar dados------------->//
    @Override
    public void salvarP(Pessoa pessoa) {
        entityManager.persist(pessoa);
    }

    //<-------------Query 1------------->//
    @Override
    public List<Pessoa> findAllPessoa() {
        Query q = entityManager.createQuery(
                "SELECT p FROM Pessoa p");
        return (List<Pessoa>) q.getResultList();
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

    //<-------------Query 2------------->//
    @Override
    public List<Pessoa> findNamePessoaQuery() {
        Query query = entityManager
                .createQuery(
                        "SELECT DISTINCT p.nome  "
                        + "FROM Pessoa p");
        return (List<Pessoa>) query.getResultList();
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

    //<-------------Query 3------------->//
    @Override
    public List<Pessoa> findNameEndPessoaQuery() {
        Query query = entityManager
                .createQuery(
                        "SELECT p.nome, p.endereco"
                        + " FROM Pessoa p");
        return (List<Pessoa>) query.getResultList();
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

    //<-------------Query 4------------->//
    @Override
    public List<Pessoa> findPessoaAvenidaQuery() {
        Query query = entityManager
                .createQuery(
                        "SELECT P FROM Pessoa p WHERE p.endereco.tipoLogradouro = 1");
        return (List<Pessoa>) query.getResultList();
    }

    @Override
    public List<Pessoa> findPessoaAvenidaTyped() {
        TypedQuery<Pessoa> typedQuery = entityManager.
                createQuery("SELECT P FROM Pessoa p WHERE p.endereco.tipoLogradouro = 1", Pessoa.class);
        return (List<Pessoa>) typedQuery.getResultList();
    }

    @Override
    public List<Pessoa> findPessoaAvenidaNamed() {
        return entityManager.createNamedQuery("Pessoa.findPessoaAvenida", Pessoa.class).getResultList();
    }

    //<-------------Query 5------------->//
    @Override
    public List<Pessoa> findPessoaNotPracaQuery() {
        Query query = entityManager
                .createQuery(
                        "SELECT P FROM Pessoa p WHERE p.endereco.tipoLogradouro != 2");
        return (List<Pessoa>) query.getResultList();
    }

    @Override
    public List<Pessoa> findPessoaNotPracaTyped() {
        TypedQuery<Pessoa> typedQuery = entityManager.
                createQuery("SELECT P FROM Pessoa p WHERE p.endereco.tipoLogradouro != 2", Pessoa.class);
        return (List<Pessoa>) typedQuery.getResultList();
    }

    @Override
    public List<Pessoa> findPessoaNotPracaNamed() {
        return entityManager.createNamedQuery("Pessoa.findPessoaNotPraca", Pessoa.class).getResultList();
    }

    //<-------------Query 6------------->//
    @Override
    public List<Pessoa> findPessoaTelefonesQuery() {
        return (List<Pessoa>) entityManager.createQuery("SELECT p.nome, t FROM Pessoa p JOIN p.telefones t")
                .getResultList();
    }

    @Override
    public List<Object[]> findPessoaTelefonesTyped() {
        return entityManager.createQuery("SELECT p.nome, t FROM Pessoa p JOIN p.telefones t", Object[].class).getResultList();
    }

    @Override
    public List<Object[]>findPessoaTelefonesNamed() {
        return entityManager.createNamedQuery("Pessoas.findNomeTelefones", Object[].class).getResultList();
    }

    //<-------------Query 7------------->//
    @Override
    public List<Pessoa> findPessoaNascimentoTyped(LocalDate data1, LocalDate data2) {
        return entityManager.createQuery("Select p from Pessoa p where p.nascimento >= :data1 and p.nascimento <= :data2", Pessoa.class).setParameter("data1",data1).setParameter("data2",data2).getResultList();
    }

    //<-------------Query 8------------->//
    @Override
    public List<Pessoa> findPessoaDDDTyped(Byte DDD) {
        return entityManager.createQuery("Select p from Pessoa p join p.telefones t where t.ddd = :DDD", Pessoa.class).setParameter("DDD", DDD).getResultList();
    }

    //<-------------Query 9------------->//
    @Override
    public List<Pessoa> findPessoaNotTelefoneTyped() {
        return entityManager.createQuery("select p from Pessoa p where p.telefones is empty",Pessoa.class).getResultList();
    }

    //<-------------Query 10------------->//
    @Override
    public List<Object[]> findPessoaQuantosTelefonesTyped() {
        return entityManager.createQuery("select p.nome, count(p) from Pessoa p join p.telefones t group by p.nome",Object[].class).getResultList();
    }
}
