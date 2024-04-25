package org.zerock.w1.todo;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoExampleController", urlPatterns = "/todo/example")
public class TodoExampleController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("todo/example");

        List<TodoDTO> todoDTOList = TodoService.INSTANCE.getList();
        req.setAttribute("list", todoDTOList);
        req.getRequestDispatcher("/WEB-INF/example/example.jsp").forward(req, resp);
    }
}
