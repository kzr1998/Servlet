package check;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "CheckServlet")
public class CheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType( "text/html;charset=utf-8" );//处理输出乱码
        //创建水果集合
        Map<String,String> map = new HashMap<String,String>();

        //存入单词
        map.put("苹果", "apple");
        map.put("梨", "Pear");
        map.put("芒果", "Mango");

        //获得请求中的值
        String key = request.getParameter("fruits");

        //判断是否存在
        boolean flag = map.containsKey(key);

        if(flag==true) {
            //存在进行跳转
            request.setAttribute("fruits", map.get(key));
            request.getRequestDispatcher("/success.jsp").forward(request, response);
        }else if(flag==false){
            HttpSession session = request.getSession();
            session.setAttribute("message", "没有找到对应的单词解释");
            response.sendRedirect("/fail.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               this.doPost( request,response );
    }
}
