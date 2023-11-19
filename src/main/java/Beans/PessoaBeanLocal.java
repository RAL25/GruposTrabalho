/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package Beans;

import com.mycompany.grupostrabalho.Pessoa;
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
    public List<Pessoa>  findNamePessoaQuery();
    
    public List<String> findNamePessoaTyped();
    
    public List<String> findNamePessoaNamed();
    //<-------------Query 3------------->//
    public List<Pessoa>  findNameEndPessoaQuery();
    
    public List<Pessoa> findNameEndPessoaTyped();
    
    public List<Pessoa> findNameEndPessoaNamed();
    //<-------------Query 4------------->//
    public List<Pessoa>  findPessoaAvenidaQuery();
    
    public List<Pessoa> findPessoaAvenidaTyped();
    
    public List<Pessoa> findPessoaAvenidaNamed();
    
    //<-------------Query 5------------->//
    public List<Pessoa>  findPessoaNotPracaQuery();
    
    public List<Pessoa>  findPessoaNotPracaTyped();
    
    public List<Pessoa>  findPessoaNotPracaNamed();
    
    //<-------------Query 6------------->//
    //<-------------Query 7------------->//
    //<-------------Query 8------------->//
    //<-------------Query 9------------->//
    //<-------------Query 10------------->//
    //<-------------Query 11------------->//
    //<-------------Query 12------------->//
    //<-------------Query 13------------->//
    //<-------------Query 14------------->//
    //<-------------Query 15------------->//
    //<-------------Query 16------------->//
    //<-------------Query 17------------->//
    //<-------------Query 18------------->//
    //<-------------Query 19------------->//
    //<-------------Query 20------------->//
    //<-------------Query 21------------->//
    //<-------------Query 22------------->//
}
