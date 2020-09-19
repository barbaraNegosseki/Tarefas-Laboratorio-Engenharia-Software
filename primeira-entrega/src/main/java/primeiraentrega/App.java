package primeiraentrega;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class App {
    
    @WebServlet(urlPatterns={"primeira-tarefa"})
    public class MeuServlet extends HttpServlet{

        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse resp){
            try {
                PrintWriter pw = resp.getWriter();
                pw.write("Laboratório de Engenharia de Software - Primeira entrega Servlet Web");
                pw.write("Barbara Eugênia Negosseki de Gontijo 1460481921092");
                pw.write("Prof. Fabrício Galende Carvalho");                
            } catch (IOException ioe) {
                System.out.println("Erro ao escrever a mensagem!");
            }           
        }
    }
}
