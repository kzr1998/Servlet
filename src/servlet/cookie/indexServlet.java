package servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "indexServlet")
public class indexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cs=request.getCookies();
        String user=null;
        for(Cookie c:cs){
            System.out.println( c.getName()+":"+c.getValue() );
          if(c.getName().equals( user )){
              user=c.getName();
              break;
          }
        }
        if(user==null){
            response.getWriter().print( "user 不存在！" );
        }else {
            response.getWriter().print( "user:"+user );
        }
    }
}
