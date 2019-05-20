package jstlservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "jstl4")
public class jstl4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType( "text/html;charset=utf-8" );
        List list=new ArrayList(  );
        list.add( new Notice( "003","一定多写代码，多练习呦！" ) );
        list.add( new Notice( "002","欢迎学习java Web课程！" ) );
        list.add( new Notice( "001","欢迎来到慕课网！" ) );
        request.setAttribute( "notice",list );
        request.getRequestDispatcher( "/notice.jsp" ).forward( request,response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     this.doPost( request,response );
    }
}
