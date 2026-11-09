package com.example.entity.DAO;
import com.example.entity.Entity.Produit;
import com.example.entity.Util.JpaUtil;
import jakarta.persistence.EntityManager;

public class ProduitDAO {
    public void ajouter(Produit p){
        EntityManager em =JpaUtil.getEm();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        System.out.println("Produit a été ajouter");
        em.close();




    }
}
