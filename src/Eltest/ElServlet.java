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
        Course course=new Course();
        course.setId( 2 );
        course.setName( "张三" );
        course.setCategory( "方向" );
        request.setAttribute( "Course",course );
        request.getRequestDispatcher( "/info.jsp" ).forward( request,response );
        //response.sendRedirect( "/info.jsp" );
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      this.doPost( request,response );
    }
}
