package jstlservlet;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.time.Month;
        import java.util.HashSet;
        import java.util.Map;
        import java.util.Set;

@WebServlet(name = "jstl3")
public class jstl3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              response.setContentType( "text/html;charset=utf-8" );
              Set set=new HashSet(  );
              set.add( new month( "May" ) );
              set.add( new month("March" ) );
              set.add( new month( "January" ) );
              set.add( new month("February" ) );
              set.add( new month( "April" ) );
              request.setAttribute( "month",set );
              request.getRequestDispatcher( "/month.jsp" ).forward( request,response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                   this.doPost( request,response );
    }
}
