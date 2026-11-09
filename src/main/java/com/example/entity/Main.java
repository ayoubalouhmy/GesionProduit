package com.example.entity;
import com.example.entity.Entity.Produit;
import com.example.entity.DAO.ProduitDAO;



public class Main {
    public static void main(String[] args) {
        Produit produit = new Produit("bassla", 40, 10);
        ProduitDAO dao =new ProduitDAO();
        dao.ajouter(produit);
    }
}
