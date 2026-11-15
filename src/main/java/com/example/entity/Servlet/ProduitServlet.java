package com.example.entity.Servlet;

import com.example.entity.Entity.Produit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.example.entity.DAO.ProduitDAO;
@WebServlet("/produit")
public class ProduitServlet extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,HttpServletResponse response
    )throws ServletException,  IOException {
        ProduitDAO dao = new ProduitDAO();
        List<Produit> produits = dao.getAlData();
        request.setAttribute("produit", produits);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }


}