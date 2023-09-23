/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package Beans;

import com.mycompany.grupostrabalho.Pessoa;
import java.time.LocalDate;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@Singleton
@Startup
public class SalvarDados {
// EJB(s) para operações de persistência

    @Inject
    private PessoaBeanLocal pessoaBean;
    

    @PostConstruct
//    @Override
    public void popularBanco() {
    // Criação e persistência de objetos
    
    //<editor-fold defaultstate="collapsed" desc="Pessoa1">
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ana Zaira");
        pessoa.setEmail("ana@mail.com");
        pessoa.setNascimento(LocalDate.of(2001, 01, 01));
    //</editor-fold>
                
        pessoaBean.salvar(pessoa);
    }
}
