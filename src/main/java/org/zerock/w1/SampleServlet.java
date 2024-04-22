package org.zerock.w1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="sampleServlet", urlPatterns = "/sample")
public class SampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet........." + this);
    } // "/sample" 반복 호출 시, this의 주소가 같다. 즉, 동일한 객체를 이용해서 여러번 호출된다.

    @Override
    public void destroy() {
        System.out.println("destroy.................");
    } //톰캣 종료 시 한번만 실행됨.

    @Override
    public void init() throws ServletException {
        System.out.println("init(ServletConfig)..................");
    } // "/sample" 호출 시 한번만 실행됨.
}
