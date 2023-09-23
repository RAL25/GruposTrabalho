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
import java.util.List;
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
        pessoa1.setTelefones((List<Telefone>) p1t1);
        pessoa1.setTelefones((List<Telefone>) p1t2);
        pessoa1.setTelefones((List<Telefone>) p1t3);
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
        pessoa2.setTelefones((List<Telefone>) p2t1);
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

        pessoa1.setNome("Débora Wendel");
        pessoa1.setEmail("debora@mail.com");
        pessoa1.setNascimento(LocalDate.of(2004, 04, 04));

        endereco4.setTipoLogradouro(TipoLogradouro.PRACA);
        endereco4.setLogradouro("4");
        endereco4.setNumero(4444);
        endereco4.setBairro("Quatroberto");

        p4t1.setDdd((byte) 44);
        p4t1.setNumero(44444444);
        p4t2.setDdd((byte) 45);
        p4t2.setNumero(45454545);

        pessoa1.setEndereco(endereco1);
        pessoa1.setTelefones((List<Telefone>) p1t1);
        pessoa1.setTelefones((List<Telefone>) p1t2);
        //</editor-fold>

        
        //<editor-fold defaultstate="collapsed" desc="Grupo1">
        Grupo grupo1 = new Grupo();
        Atuacao g1a1 = new Atuacao();
        Atuacao g1a2 = new Atuacao();
        Atuacao g1a3 = new Atuacao();
        Atuacao g1a4 = new Atuacao();
        Atuacao g1a5 = new Atuacao();

        grupo1.setNome("Estudo I");
        grupo1.setAtivo(Boolean.FALSE);
        
        grupo1.setLider(pessoa1);
        grupo1.setMembros((List<Pessoa>)pessoa1);
        grupo1.setMembros((List<Pessoa>)pessoa2);
        grupo1.setMembros((List<Pessoa>)pessoa3);
        grupo1.setMembros((List<Pessoa>)pessoa4);        

        g1a1.setInicio(LocalDate.of(2011, 01, 01));
        g1a1.setTermino(LocalDate.of(2021, 11, 11));
        g1a2.setInicio(LocalDate.of(2012, 01, 01));
        g1a2.setTermino(LocalDate.of(2022, 11, 11));
        g1a3.setInicio(LocalDate.of(2012, 01, 02));
        g1a3.setTermino(LocalDate.of(2021, 01, 12));
        g1a4.setInicio(LocalDate.of(2013, 01, 03));
        g1a4.setTermino(LocalDate.of(2021, 01, 13));
        g1a5.setInicio(LocalDate.of(2014, 01, 04));
        g1a5.setTermino(LocalDate.of(2021, 01, 14));
        
        grupo1.setAtuacao((List<Atuacao>) g1a1);
        grupo1.setAtuacao((List<Atuacao>) g1a2);
        grupo1.setAtuacao((List<Atuacao>) g1a3);
        grupo1.setAtuacao((List<Atuacao>) g1a1);
        grupo1.setAtuacao((List<Atuacao>) g1a2);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Grupo2">
        Grupo grupo2 = new Grupo();
        Atuacao g2a1 = new Atuacao();
        Atuacao g2a2 = new Atuacao();
        Atuacao g2a3 = new Atuacao();
        Atuacao g2a4 = new Atuacao();
        Atuacao g2a5 = new Atuacao();

        grupo2.setNome("Estudo II");
        grupo2.setAtivo(Boolean.TRUE);
        
        grupo2.setLider(pessoa2);
        grupo2.setMembros((List<Pessoa>)pessoa2);
        grupo2.setMembros((List<Pessoa>)pessoa4);        

        g2a1.setInicio(LocalDate.of(2012, 01, 02));
//        g2a1.setTermino(LocalDate.of(2021, 11, 11));
        g2a2.setInicio(LocalDate.of(2012, 01, 02));
//        g2a2.setTermino(LocalDate.of(2022, 11, 11));

        grupo2.setAtuacao((List<Atuacao>) g2a1);
        grupo2.setAtuacao((List<Atuacao>) g2a2);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Grupo3">
        Grupo grupo3 = new Grupo();
        Atuacao g3a1 = new Atuacao();
        Atuacao g3a2 = new Atuacao();

        grupo3.setNome("Estudo III");
        grupo3.setAtivo(Boolean.FALSE);
        
        grupo3.setLider(pessoa3);
        grupo3.setMembros((List<Pessoa>)pessoa3);
        grupo3.setMembros((List<Pessoa>)pessoa4);        

        g3a1.setInicio(LocalDate.of(2012, 01, 03));
        g3a1.setTermino(LocalDate.of(2023, 01, 13));
        g3a2.setInicio(LocalDate.of(2012, 01, 03));
        g3a2.setTermino(LocalDate.of(2023, 01, 13));
        
        grupo3.setAtuacao((List<Atuacao>) g3a1);
        grupo3.setAtuacao((List<Atuacao>) g3a2);
    //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Grupo4">
        Grupo grupo4 = new Grupo();
        Atuacao g4a1 = new Atuacao();
        Atuacao g4a2 = new Atuacao();
        Atuacao g4a3 = new Atuacao();

        grupo4.setNome("Estudo IV");
        grupo4.setAtivo(Boolean.TRUE);
        
        grupo4.setLider(pessoa2);
        grupo4.setMembros((List<Pessoa>)pessoa1);
        grupo4.setMembros((List<Pessoa>)pessoa3);
        grupo4.setMembros((List<Pessoa>)pessoa4);        

        g4a1.setInicio(LocalDate.of(2012, 01, 04));
        g4a1.setTermino(LocalDate.of(2024, 01, 14));
        g4a2.setInicio(LocalDate.of(2012, 01, 04));
        g4a2.setTermino(LocalDate.of(2024, 01, 14));
        g4a3.setInicio(LocalDate.of(2012, 01, 04));
        g4a3.setTermino(LocalDate.of(2024, 01, 14));
        
        grupo4.setAtuacao((List<Atuacao>) g4a1);
        grupo4.setAtuacao((List<Atuacao>) g4a2);
        grupo4.setAtuacao((List<Atuacao>) g4a3);
//</editor-fold>

        pessoaBean.salvarP(pessoa1);
        pessoaBean.salvarP(pessoa2);
        pessoaBean.salvarP(pessoa3);
        pessoaBean.salvarP(pessoa4);
        
        pessoaBean.salvarG(grupo1);
        pessoaBean.salvarG(grupo2);
        pessoaBean.salvarG(grupo3);
        pessoaBean.salvarG(grupo4);
    }
}
