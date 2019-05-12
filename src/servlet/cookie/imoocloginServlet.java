package servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "imoocloginServlet")
public class imoocloginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       System.out.println( "用户登录成功！" );
        Cookie cookie=new Cookie( "user","admin" );
        cookie.setMaxAge( 60*60*24*7 );
        response.addCookie( cookie );
        response.getWriter().print( "login success!" );
    }
}
