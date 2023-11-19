/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package Beans;

import com.mycompany.grupostrabalho.Atuacao;
import com.mycompany.grupostrabalho.Endereco;
import com.mycompany.grupostrabalho.Grupo;
import com.mycompany.grupostrabalho.Pessoa;
import com.mycompany.grupostrabalho.Telefone;
import com.mycompany.grupostrabalho.TipoLogradouro;
import java.time.LocalDate;
//import java.util.List;
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
        Atuacao a1 = new Atuacao();
        Atuacao a2 = new Atuacao();
        Atuacao a3 = new Atuacao();
        Atuacao a4 = new Atuacao();
        Atuacao a5 = new Atuacao();
        Atuacao a6 = new Atuacao();
        Atuacao a7 = new Atuacao();
        Atuacao a8 = new Atuacao();
        Atuacao a9 = new Atuacao();
        Atuacao a10 = new Atuacao();
        Atuacao a11 = new Atuacao();
        Atuacao a12 = new Atuacao();

        //<editor-fold defaultstate="collapsed" desc="Pessoa1">
        Pessoa pessoa1 = new Pessoa();
        Endereco endereco1 = new Endereco();
        Telefone p1t1 = new Telefone();
        Telefone p1t2 = new Telefone();
        Telefone p1t3 = new Telefone();

        pessoa1.setNome("Ana Zaira");
        pessoa1.setEmail("ana@mail.com");
        pessoa1.setNascimento(LocalDate.of(2001, 01, 01));

        endereco1.setTipoLogradouro(TipoLogradouro.RUA);
        endereco1.setLogradouro("1");
        endereco1.setNumero(1111);
        endereco1.setBairro("Humberto");

        p1t1.setDdd((byte) 11);
        p1t1.setNumero(11111111);
        p1t2.setDdd((byte) 12);
        p1t2.setNumero(12121212);
        p1t3.setDdd((byte) 13);
        p1t3.setNumero(13131313);
        
        pessoa1.setEndereco(endereco1);
        pessoa1.getTelefones().add(p1t1);
        pessoa1.getTelefones().add(p1t2);
        pessoa1.getTelefones().add(p1t3);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="pessoa2">
        Pessoa pessoa2 = new Pessoa();
        Endereco endereco2 = new Endereco();
        Telefone p2t1 = new Telefone();

        pessoa2.setNome("Beatriz Yana");
        pessoa2.setEmail("beatriz@mail.com");
        pessoa2.setNascimento(LocalDate.of(2002, 02, 02));

        endereco2.setTipoLogradouro(TipoLogradouro.AVENIDA);
        endereco2.setLogradouro("2");
        endereco2.setNumero(2222);
        endereco2.setBairro("Doisberto");

        p2t1.setDdd((byte) 22);
        p2t1.setNumero(22222222);

        pessoa2.setEndereco(endereco2);
        pessoa2.getTelefones().add(p2t1);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="pessoa3">
        Pessoa pessoa3 = new Pessoa();
        Endereco endereco3 = new Endereco();

        pessoa3.setNome("Cecília Xerxes");
        pessoa3.setEmail("cecilia@mail.com");
        pessoa3.setNascimento(LocalDate.of(2003, 03, 03));

        endereco3.setTipoLogradouro(TipoLogradouro.AVENIDA);
        endereco3.setLogradouro("3");
        endereco3.setNumero(3333);
        endereco3.setBairro("Tresberto");

        pessoa3.setEndereco(endereco3);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="pessoa4">
        Pessoa pessoa4 = new Pessoa();
        Endereco endereco4 = new Endereco();
        Telefone p4t1 = new Telefone();
        Telefone p4t2 = new Telefone();

        pessoa4.setNome("Débora Wendel");
        pessoa4.setEmail("debora@mail.com");
        pessoa4.setNascimento(LocalDate.of(2004, 04, 04));

        endereco4.setTipoLogradouro(TipoLogradouro.PRACA);
        endereco4.setLogradouro("4");
        endereco4.setNumero(4444);
        endereco4.setBairro("Quatroberto");

        p4t1.setDdd((byte) 44);
        p4t1.setNumero(44444444);
        p4t2.setDdd((byte) 45);
        p4t2.setNumero(45454545);

        pessoa4.setEndereco(endereco4);
        pessoa4.getTelefones().add(p4t1);
        pessoa4.getTelefones().add(p4t2);
        //</editor-fold>

        
        //<editor-fold defaultstate="collapsed" desc="Grupo1">
        Grupo grupo1 = new Grupo();        

        grupo1.setNome("Estudo I");
        grupo1.setAtivo(Boolean.FALSE);
        
        grupo1.setLider(pessoa1);
        
        a1.setInicio(LocalDate.of(2011, 01, 01));
        a1.setTermino(LocalDate.of(2021, 11, 11));
        a2.setInicio(LocalDate.of(2012, 01, 01));
        a2.setTermino(LocalDate.of(2022, 11, 11));
        a3.setInicio(LocalDate.of(2012, 01, 02));
        a3.setTermino(LocalDate.of(2021, 01, 12));
        a4.setInicio(LocalDate.of(2013, 01, 03));
        a4.setTermino(LocalDate.of(2021, 01, 13));
        a5.setInicio(LocalDate.of(2014, 01, 04));
        a5.setTermino(LocalDate.of(2021, 01, 14));
        
        a1.setPessoa(pessoa1);
        a2.setPessoa(pessoa1);
        a3.setPessoa(pessoa2);
        a4.setPessoa(pessoa3);
        a5.setPessoa(pessoa4);
        
        a1.setGrupo(grupo1);
        a2.setGrupo(grupo1);
        a3.setGrupo(grupo1);
        a4.setGrupo(grupo1);
        a5.setGrupo(grupo1);
        
        grupo1.getAtuacao().add(a1);
        grupo1.getAtuacao().add(a2);
        grupo1.getAtuacao().add(a3);
        grupo1.getAtuacao().add(a4);
        grupo1.getAtuacao().add(a5);
        
        pessoa1.getAtuacoes().add(a1);
        pessoa1.getAtuacoes().add(a2);
        pessoa2.getAtuacoes().add(a3);
        pessoa3.getAtuacoes().add(a4);
        pessoa4.getAtuacoes().add(a5); 
        
        pessoa1.getGrupos().add(grupo1);
        pessoa2.getGrupos().add(grupo1);
        pessoa3.getGrupos().add(grupo1);
        pessoa4.getGrupos().add(grupo1);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Grupo2">
        Grupo grupo2 = new Grupo();

        grupo2.setNome("Estudo II");
        grupo2.setAtivo(Boolean.TRUE);
        
        grupo2.setLider(pessoa2);      

        a6.setInicio(LocalDate.of(2012, 01, 02));
        a7.setInicio(LocalDate.of(2012, 01, 02));
        
        a6.setPessoa(pessoa2);
        a7.setPessoa(pessoa4);
        
        a6.setGrupo(grupo2);
        a7.setGrupo(grupo2);
        
        grupo2.getAtuacao().add(a6);
        grupo2.getAtuacao().add(a7);
        
        pessoa2.getAtuacoes().add(a6);
        pessoa4.getAtuacoes().add(a7);
        
        pessoa2.getGrupos().add(grupo2);
        pessoa4.getGrupos().add(grupo2);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Grupo3">
        Grupo grupo3 = new Grupo();

        grupo3.setNome("Estudo III");
        grupo3.setAtivo(Boolean.FALSE);
        
        grupo3.setLider(pessoa3);
        
        a8.setInicio(LocalDate.of(2012, 01, 03));
        a8.setTermino(LocalDate.of(2023, 01, 13));
        a9.setInicio(LocalDate.of(2012, 01, 03));
        a9.setTermino(LocalDate.of(2023, 01, 13));
        
        a8.setPessoa(pessoa3);
        a9.setPessoa(pessoa4);
        
        a8.setGrupo(grupo3);
        a9.setGrupo(grupo3);

        grupo3.getAtuacao().add(a8);
        grupo3.getAtuacao().add(a9);
        
        pessoa3.getAtuacoes().add(a8);
        pessoa4.getAtuacoes().add(a9);
        
        pessoa3.getGrupos().add(grupo3);
        pessoa4.getGrupos().add(grupo3);
    //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Grupo4">
        Grupo grupo4 = new Grupo();

        grupo4.setNome("Estudo IV");
        grupo4.setAtivo(Boolean.TRUE);
        
        grupo4.setLider(pessoa2);      

        a10.setInicio(LocalDate.of(2012, 01, 04));
        a10.setTermino(LocalDate.of(2024, 01, 14));
        a11.setInicio(LocalDate.of(2012, 01, 04));
        a11.setTermino(LocalDate.of(2024, 01, 14));
        a12.setInicio(LocalDate.of(2012, 01, 04));
        a12.setTermino(LocalDate.of(2024, 01, 14));
        
        a10.setPessoa(pessoa2);
        a11.setPessoa(pessoa3);
        a12.setPessoa(pessoa4);
        
        a10.setGrupo(grupo4);
        a11.setGrupo(grupo4);
        a12.setGrupo(grupo4);
        
        grupo4.getAtuacao().add(a10);
        grupo4.getAtuacao().add(a11);
        grupo4.getAtuacao().add(a12);
        
        pessoa2.getAtuacoes().add(a10);
        pessoa3.getAtuacoes().add(a11);
        pessoa4.getAtuacoes().add(a12);
        
        pessoa2.getGrupos().add(grupo4);
        pessoa3.getGrupos().add(grupo4);
        pessoa4.getGrupos().add(grupo4);
//</editor-fold>

        pessoaBean.salvarP(pessoa1);
        pessoaBean.salvarP(pessoa2);
        pessoaBean.salvarP(pessoa3);
        pessoaBean.salvarP(pessoa4);
    }
}
