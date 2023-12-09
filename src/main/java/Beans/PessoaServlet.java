/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Beans;

import Util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@WebServlet(name = "PessoaServlet", urlPatterns = {"/Relatorios"})
@Transactional
public class PessoaServlet extends HttpServlet {

    @Inject
    private PessoaBeanLocal pessoaBean;
    @Inject
    private GrupoBeanLocal grupoBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Desenvolvimento Web</p>");
            out.println("<h1>Estudo Dirigido: Jakarta Persistence Query Language</h1>");
            out.println("<a href=\"/GruposTrabalho-1.0\">Voltar</a>");
            out.println("</body>");
            out.println("</html>");
            //--
            out.println("<h2>Consulta 1.A: Quais as pessoas (dados completos) cadastradas? Por meio de Query</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findAllPessoa())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 1.B: Quais as pessoas (dados completos) cadastradas? Por meio de TypedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findAllPessoaTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 1.C: Quais as pessoas (dados completos) cadastradas? Por meio de NamedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findAllPessoaNamed())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 2.A: Quais os nomes das pessoas? Por meio de Query</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findNamePessoaQuery())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 2.B: Quais os nomes das pessoas? Por meio de TypedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findNamePessoaTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 2.C: Quais os nomes das pessoas? Por meio de NamedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findNamePessoaNamed())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 3.A: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de Query</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findNameEndPessoaQuery())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 3.B: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de TypedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findNameEndPessoaQuery())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 3.C: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de NamedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findNameEndPessoaQuery())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 4.A: Quais pessoas (dados completos) moram em avenidas? Por meio de Query</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaAvenidaQuery())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 4.B: Quais pessoas (dados completos) moram em avenidas? Por meio de TypedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaAvenidaTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 4.C: Quais pessoas (dados completos) moram em avenidas? Por meio de NamedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaAvenidaNamed())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 5.A: Quais pessoas (dados completos) não moram em praças? Por meio de Query</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaNotPracaQuery())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 5.B: Quais pessoas (dados completos) não moram em praças? Por meio de TypedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaNotPracaTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 5.C: Quais pessoas (dados completos) não moram em praças? Por meio de NamedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaNotPracaNamed())
                    + "</pre>");
              //--
            out.println("<h2>Consulta 6.A: Quais pessoas (nomes) e seus respectivos telefones (dados completos)? Por meio de Query</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaTelefonesQuery())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 6.B: Quais pessoas (nomes) e seus respectivos telefones (dados completos)? Por meio de TypedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaTelefonesTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 6.C: Quais pessoas (nomes) e seus respectivos telefones (dados completos)? Por meio de NamedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaTelefonesNamed())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 7. Quais as pessoas (dados completos) que nasceram entre abril de 2001 e abril de 2004?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaNascimentoTyped(LocalDate.of(2001, Month.APRIL, 1), LocalDate.of(2004, Month.APRIL, 30)))
                    + "</pre>");
            //--
            out.println("<h2>Consulta 8-1. Quais pessoas (dados completos) têm telefone do estado do Paraná? </h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaDDDTyped((byte)44))
                    + "</pre>");
            //--
            out.println("<h2>Consulta 8-2. Quais pessoas (dados completos) têm telefone do estado do Rio de Janeiro? </h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaDDDTyped((byte)22))
                    + "</pre>");
            //--
            out.println("<h2>Consulta 9. Quais pessoas (dados completos) não possuem telefone?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaNotTelefoneTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 10. Quantos telefones cada pessoa (nome) tem?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findPessoaQuantosTelefonesTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 11. Quais grupos (dados completos) não estão ativos?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findGrupoInativoTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 12. Quais são os líderes (nomes) dos grupos (nomes)?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findLiderGrupoTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 13. Quais são os membros (nomes) do grupo com nome “Estudo IV” com ordenação alfabética inversa?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findMembroGrupoAlfaTyped("Estudo IV"))
                    + "</pre>");
            //--
            out.println("<h2>Consulta 14. Quais são os grupos (dados completos) liderados por “Beatriz Yana”?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findGrupolideradoTyped("Beatriz Yana"))
                    + "</pre>");
            //--
            out.println("<h2>Consulta 15. Quais são as datas de início e de término da atuação e os grupos (nomes) nos quais “Cecília Xerxes” é membro?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findGrupoIniFimTyped("Cecília Xerxes"))
                    + "</pre>");
            //--
            out.println("<h2>Consulta 16. Quais são os grupos (dados completos) que contêm “II” em seus nomes?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findGrupoIINomeTyped("II"))
                    + "</pre>");
            //--
            out.println("<h2>Consulta 17. Quais são os grupos (nomes) e os respectivos totais de membros distintos já alocados?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findGrupoAllMembrosTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 18. Quais grupos (nomes) têm 3 ou mais atuações de membros e quanto são esses totais de atuações?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findGrupo3OuMaisTyped(3))
                    + "</pre>");
            //--
            out.println("<h2>Consulta 19. Quais membros (nomes) entraram a partir de 2012 no primeiro grupo?</h2>");
            List<Long> gruposId = new ArrayList<>();
            gruposId.add((long) 1);
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findGrupoEntered2012Typed(gruposId,LocalDate.of(2012,1,1)))
                    + "</pre>");
            //--
            out.println("<h2>Consulta 20. Quais os grupos (nomes), membros (nomes) e as respectivas datas de entrada daqueles que entraram a partir de 2012 em qualquer grupo?</h2>");
            List<Long> gruposId2 = new ArrayList<>();
            gruposId2.add((long) 1);
            gruposId2.add((long) 2);
            gruposId2.add((long) 3);
            gruposId2.add((long) 4);

            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findGrupoMembroIniTyped(gruposId2,LocalDate.of(2012,1,1)))
                    + "</pre>");
            //--
            out.println("<h2>Consulta 21. Quais os grupos (nomes) e respectivos membros (nomes) que não possuem data de término de atuação em seus grupos?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findGrupoMembroNotFimTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 22. Quais são os grupos (nomes) e líderes (nomes) com respectivos membros (nomes)?</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(grupoBean.findGrupoLiderMembroTyped())
                    + "</pre>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
