package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHelloWorld extends HttpServlet{

    private String message;

    @Override
    public void init() {

        message = "HelloWorld";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

        //Set response type
        response.setContentType("text/html");

        //actual logic
        PrintWriter out = response.getWriter();
        out.println("<h1>"+message+"</h1>");
    }

    public void destory() {

    }
}
