/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package Beans;

import com.mycompany.grupostrabalho.Pessoa;
import java.time.LocalDate;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@Local
public interface PessoaBeanLocal {

    //<-------------Persistência para salvar dados------------->//
    public void salvarP(Pessoa pessoa);

    //<-------------Consultas------------->//
    //<-------------Query 1------------->//
    public List<Pessoa> findAllPessoa();

    public List<Pessoa> findAllPessoaTyped();

    public List<Pessoa> findAllPessoaNamed();

    //<-------------Query 2------------->//
    public List<Pessoa> findNamePessoaQuery();

    public List<String> findNamePessoaTyped();

    public List<String> findNamePessoaNamed();

    //<-------------Query 3------------->//
    public List<Pessoa> findNameEndPessoaQuery();

    public List<Pessoa> findNameEndPessoaTyped();

    public List<Pessoa> findNameEndPessoaNamed();

    //<-------------Query 4------------->//
    public List<Pessoa> findPessoaAvenidaQuery();

    public List<Pessoa> findPessoaAvenidaTyped();

    public List<Pessoa> findPessoaAvenidaNamed();

    //<-------------Query 5------------->//
    public List<Pessoa> findPessoaNotPracaQuery();

    public List<Pessoa> findPessoaNotPracaTyped();

    public List<Pessoa> findPessoaNotPracaNamed();

    //<-------------Query 6------------->//
    public List<Pessoa> findPessoaTelefonesQuery();

    public List<Object[]> findPessoaTelefonesTyped();

    public List<Object[]> findPessoaTelefonesNamed();

    //<-------------Query 7------------->//
    public List<Pessoa> findPessoaNascimentoTyped(LocalDate data1, LocalDate data2);

    //<-------------Query 8------------->//
    public List<Pessoa> findPessoaDDDTyped(Byte DDD);

    //<-------------Query 9------------->//
    public List<Pessoa> findPessoaNotTelefoneTyped();

    //<-------------Query 10------------->//
    public List<Object[]> findPessoaQuantosTelefonesTyped();

}
