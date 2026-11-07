package com.example.entity.Servlet;

import com.example.entity.Entity.Produit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/produit")
public class ProduitServlet extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,HttpServletResponse response
    )throws ServletException,  IOException {
        Produit produit = new Produit("bassla", 40, 10);
        request.setAttribute("produit", produit);
        request.getRequestDispatcher("/index.jsp")
                .forward(request, response);
    }


}