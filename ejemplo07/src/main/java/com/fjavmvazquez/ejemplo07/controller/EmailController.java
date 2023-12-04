package com.fjavmvazquez.ejemplo07.controller;

import com.fjavmvazquez.ejemplo07.model.Converditor;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet( value = "/lista")
public class EmailController extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.setContentType("text/html;charset=UTF-8");
        String url = "/index.html";

        String action = req.getParameter("action");
        if (action == null){
            action = "registrar";
        }

        if (action.equals("registrar")) {
            url = "/index.jsp";
        } else if (action.equals("agregar")) {
            String centigrado = req.getParameter("cen");
            double aux;
            aux = Double.parseDouble(centigrado);
            aux = ((aux*1.8)+32);
            centigrado = String.valueOf(aux);
            Converditor con = new Converditor(centigrado);
            req.setAttribute("user",con);
            url = "/mostrarDatos.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      processRequest(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    public void destroy() {
    }
}