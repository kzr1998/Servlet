package Eltest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/info")
public class ElServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType( "text/html;charset=utf-8" );
        Course ce=new Course();
        ce.setId( 2 );
        ce.setName( "张三" );
        ce.setCategory( "方向" );
        request.setAttribute( "Course",ce );
        request.getRequestDispatcher( "/info.jsp" ).forward( request,response );
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      this.doPost( request,response );
    }

}
