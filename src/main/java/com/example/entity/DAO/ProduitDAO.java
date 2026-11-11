package com.example.entity.DAO;
import com.example.entity.Entity.Produit;
import com.example.entity.Util.JpaUtil;
import jakarta.persistence.EntityManager;
import java.util.List;
public class ProduitDAO {
    //adding to database
    public void ajouter(Produit p){
        EntityManager em =JpaUtil.getEm();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        System.out.println("Produit a été ajouter");
    }
    //modifate Database
    public void modifie(Produit p){
        EntityManager em = JpaUtil.getEm();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
        System.out.println("Produit a été modifier");
    }

}
