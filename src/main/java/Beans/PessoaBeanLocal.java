/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package Beans;

import com.mycompany.grupostrabalho.Grupo;
import com.mycompany.grupostrabalho.Pessoa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@Local
public interface PessoaBeanLocal {
    public void salvarP(Pessoa pessoa);
    
    public List<Pessoa> findAllPessoa();
    
    public Pessoa findPessoaByIdQuery(Long id);
}
