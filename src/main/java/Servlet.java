import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet( urlPatterns = "/login")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.html");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        List<KhachHang> khachHangs = new ArrayList<>();
        khachHangs.add(new KhachHang("Mai Văn Hoàn","1983-08-20","Hà Nội","/img/meow.jpg"));
        khachHangs.add(new KhachHang("Nguyễn Văn Nam","1983-08-21","Bắc Giang","/img/meow.jpg"));
        khachHangs.add(new KhachHang("Nguyễn Thái Hòa","1983-08-22","Nam Định","/img/meow.jpg"));
        khachHangs.add(new KhachHang("Trần Đăng Khoa","1983-08-17","Hà Tây","/img/meow.jpg"));
        khachHangs.add(new KhachHang("Nguyễn Đình Thi","1983-08-19","Hà Nội","/img/meow.jpg"));

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("admin")) {
            request.setAttribute("khachHangs", khachHangs);
            RequestDispatcher dispatcher = request.getRequestDispatcher("KhachHang.jsp");
            dispatcher.forward(request,response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("Login.html");
            dispatcher.forward(request,response);
        }

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");

    }
}
