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
    public Pessoa findPessoaByIdQuery(Long id) {
        Query query = entityManager
                .createQuery(
                        "select p from jpqlPessoa p "
                        + "where p.id = ?1");
        // Parâmetro indexado
        query.setParameter(1, id);
        return (Pessoa) query.getSingleResult();
    }
}
