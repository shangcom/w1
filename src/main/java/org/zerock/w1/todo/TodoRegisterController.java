package org.zerock.w1.todo;

import org.zerock.w1.HelloServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="todoRegisterController", urlPatterns = "/todo/register")
public class TodoRegisterController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("입력 화면을 볼 수 있도록 구성");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("입력을 처리하고 목록 페이지로 이동");
        System.out.println("redirect : /todo/list");
        resp.sendRedirect("/todo/list");
    }
}
