/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package Beans;

import com.mycompany.grupostrabalho.Grupo;
import com.mycompany.grupostrabalho.MembroDto;
import java.time.LocalDate;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rian Alves Leal <ral2 at ifnmg.edu.br>
 */
@Stateless
public class GrupoBean implements GrupoBeanLocal {

    @PersistenceContext
    EntityManager entityManager;

    //<-------------Query 11------------->//
    @Override
    public List<Grupo> findGrupoInativoTyped() {
        return entityManager.createQuery("SELECT g FROM Grupo g WHERE g.ativo = false", Grupo.class).getResultList();
    }

    //<-------------Query 12------------->//
    @Override
    public List<Object[]> findLiderGrupoTyped() {
        return entityManager.createQuery("SELECT g.lider.nome, g.nome FROM Grupo g",Object[].class).getResultList();
    }

    //<-------------Query 13------------->//
    @Override
    public List<Object[]> findMembroGrupoAlfaTyped(String nomegrupo) {
        return entityManager.createQuery("SELECT a.pessoa.nome FROM Grupo g JOIN g.atuacoes a "
                + "WHERE g.nome = :nomegrupo AND a.grupo.id = g.id ORDER BY a.pessoa.nome DESC",Object[].class)
                .setParameter("nomegrupo", nomegrupo).getResultList();
    }

    //<-------------Query 14------------->//
    @Override
    public List<Grupo> findGrupolideradoTyped(String nomelider) {
        return entityManager.createQuery("SELECT g FROM Grupo g WHERE g.lider.nome = :nomelider", Grupo.class)
                .setParameter("nomelider", nomelider).getResultList();
    }

    //<-------------Query 15------------->//
    @Override
    public List<Object[]> findGrupoIniFimTyped(String nome) {
        return entityManager.createQuery("SELECT g.nome, a.inicio, a.termino FROM Grupo g JOIN g.atuacoes a "
                + "WHERE a.pessoa.nome = :nome",Object[].class)
                .setParameter("nome", nome).getResultList();
    }

    //<-------------Query 16------------->//
    @Override
    public List<Grupo> findGrupoIINomeTyped(String substring) {
        return entityManager.createQuery("SELECT g FROM Grupo g WHERE g.nome LIKE :substring",Grupo.class)
                .setParameter("substring", "%" + substring + "%").getResultList();
    }

    //<-------------Query 17------------->//
    @Override
    public List<Object[]>findGrupoAllMembrosTyped() {
        return entityManager.createQuery("SELECT g.nome, COUNT(DISTINCT a.pessoa.id) FROM Grupo g JOIN g.atuacoes a GROUP BY g.nome", Object[].class).getResultList();
    }

    //<-------------Query 18------------->//
    @Override
    public List<Object[]> findGrupo3OuMaisTyped(int quantidade) {
        return entityManager.createQuery("SELECT g.nome, COUNT(a) AS qtdA FROM Grupo g JOIN g.atuacoes a GROUP BY g.nome HAVING COUNT(a) >= :qtd", Object[].class)
                .setParameter("qtd", (long)quantidade).getResultList();
    }

    //<-------------Query 19------------->//
    @Override
    public List<Object[]> findGrupoEntered2012Typed(List<Long> grupoIds, LocalDate dataInicio) {
        return entityManager.createQuery(
        "SELECT DISTINCT p.nome FROM Pessoa p JOIN p.atuacoes a WHERE a.inicio >= :dataInicio AND a.grupo.id IN :grupoIds", Object[].class)
        .setParameter("grupoIds", grupoIds)
        .setParameter("dataInicio", dataInicio).getResultList();
    }

    //<-------------Query 20------------->//
    @Override
    public List<MembroDto> findGrupoMembroIniTyped(List<Long> gruposId2, LocalDate dataInicio2) {
        return entityManager.createQuery(
        "SELECT NEW com.mycompany.grupostrabalho.MembroDto (g.nome, a.pessoa.nome, a.inicio) FROM Grupo g JOIN g.atuacoes a WHERE g.id IN :grupoIds AND g.id = a.grupo.id AND a.inicio >= :dataInicio ORDER BY g.nome, a.inicio",MembroDto.class).setParameter("grupoIds", gruposId2).setParameter("dataInicio", dataInicio2).getResultList();
    }

    //<-------------Query 21------------->//
    @Override
    public List<MembroDto> findGrupoMembroNotFimTyped() {
        return entityManager.createQuery(
        "SELECT NEW com.mycompany.grupostrabalho.MembroDto (g.nome, a.pessoa.nome) "
                + "FROM Grupo g JOIN g.atuacoes a WHERE a.termino = null ",MembroDto.class)
                .getResultList();
    }

    //<-------------Query 22------------->//
    @Override
    public List<Object[]> findGrupoLiderMembroTyped() {
        return entityManager.createQuery(
        "SELECT g.nome, g.lider.nome, a.pessoa.nome FROM Grupo g JOIN g.atuacoes a ORDER BY g.nome, g.lider.nome, a.pessoa.nome",Object[].class)
                .getResultList();
    }
}
