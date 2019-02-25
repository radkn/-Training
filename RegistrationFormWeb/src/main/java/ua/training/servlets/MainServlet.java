package ua.training.servlets;

import ua.training.controller.InputSubscriberNote;
import ua.training.model.entities.Subscriber;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(" do get main Servlet");
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        new InputSubscriberNote(req, resp).addAbonent();

        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
