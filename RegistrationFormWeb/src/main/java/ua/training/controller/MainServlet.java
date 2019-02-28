package ua.training.controller;

import ua.training.controller.InputSubscriberNote;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(" do get main Servlet");
        request.setAttribute("isSubscriberAdded", false);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println(req.getParameter("firstName"));

        if (!new InputSubscriberNote(req, resp).addSubscriber()){
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }

        req.getRequestDispatcher("WEB-INF/view/Subscriber.jsp").forward(req,resp);


    }
}
