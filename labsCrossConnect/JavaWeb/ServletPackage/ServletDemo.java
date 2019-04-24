/**
 * @author demo
 * Servlet Life cycle: from create to destory process
 * Once creation, server in all aspects. That means one object to server for all requirements
 * 1. Instance
 * 2. Initialize
 * 3. service
 * 4. destroy
 *
 *
 */

package ServletPackage;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ServletDemo implements Servlet {

        @Override
        public void init(ServletConfig arg0) {
            System.out.println("=====================init=====================");
        }
        @Override
        public void service(ServletRequest arg0,ServletResponse arg1) throws ServletException,IOException {
            System.out.println("hehe");
        }
        @Override
        public void destroy() {
            System.out.println("*************destory**************");

        }
        @Override
        public ServletConfig getServletConfig() {
            return null;
        }
        @Override
        public String getServletInfo() {
            return null;
        }

}

class ServletDemo2 extends GenericServlet{
    @Override
    public void service(ServletRequest arg0,ServletResponse arg1) throws ServletException,IOException{

        System.out.println("hehe1");

    }
}

class ServletDemo3 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{

        System.out.println("Haha");

    }

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{

        System.out.println("ee");
        doGet(req, resp);
    }
}
