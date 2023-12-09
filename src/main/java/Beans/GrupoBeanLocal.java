/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package Beans;

import com.mycompany.grupostrabalho.Grupo;
import com.mycompany.grupostrabalho.MembroDto;
import com.mycompany.grupostrabalho.Pessoa;
import java.time.LocalDate;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rian Alves Leal <ral2 at ifnmg.edu.br>
 */
@Local
public interface GrupoBeanLocal {
    //<-------------Query 11------------->//
    public List<Grupo> findGrupoInativoTyped();
    //<-------------Query 12------------->//
    public List<Object[]> findLiderGrupoTyped();
    //<-------------Query 13------------->//
    public List<Object[]> findMembroGrupoAlfaTyped(String nomegrupo);
    //<-------------Query 14------------->//
    public List<Grupo> findGrupolideradoTyped(String nomelider);
    //<-------------Query 15------------->//
    public List<Object[]> findGrupoIniFimTyped(String nome);
    //<-------------Query 16------------->//
    public List<Grupo> findGrupoIINomeTyped(String substring);
    //<-------------Query 17------------->//
    public List<Object[]> findGrupoAllMembrosTyped();
    //<-------------Query 18------------->//
    public List<Object[]> findGrupo3OuMaisTyped(int quantidade);
    //<-------------Query 19------------->//
    public List<Object[]> findGrupoEntered2012Typed(List<Long> grupoIds, LocalDate dataInicio);
    //<-------------Query 20------------->//
    public List<MembroDto> findGrupoMembroIniTyped(List<Long> gruposId2, LocalDate dataInicio2);
    //<-------------Query 21------------->//
    public List<MembroDto> findGrupoMembroNotFimTyped();
    //<-------------Query 22------------->//
    public List<Object[]> findGrupoLiderMembroTyped();
}
