package ru.serveram.transport.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pavel on 18.09.16.
 */
//todo: что то сделать с сервлетом
public class htmlServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //кусок жесткой логики *.html
        String[] preUri = req.getRequestURI().split("\\.");
        if(preUri.length != 2) resp.sendError(404);
        //xhtml не работает.
        String uri = preUri[0]+".jsp";

        RequestDispatcher view = req.getRequestDispatcher("WEB-INF/pages/static"+uri);
        view.forward(req, resp);

    }
}
