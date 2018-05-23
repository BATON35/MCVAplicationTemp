package controller;

import service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login", urlPatterns = "/login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        LoginService loginService = new LoginService();
        if (loginService.authenticate(request.getParameter("userLogin"), request.getParameter("password"))) {
            request.setAttribute("imie", request.getParameter("userLogin"));
            request.getRequestDispatcher("successful.jsp").forward(request, response);

            return;
        }
        //response.sendRedirect("login.jsp");
        request.setAttribute("imie", request.getParameter("userLogin"));
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
