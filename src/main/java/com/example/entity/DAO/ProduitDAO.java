package com.example.entity.DAO;
import com.example.entity.Entity.Produit;
import com.example.entity.Util.JpaUtil;
import jakarta.persistence.EntityManager;
import java.util.List;
public class ProduitDAO {
    //adding to database
    public void ajouter(Produit p) {
        EntityManager em = JpaUtil.getEm();

        try {
            em.getTransaction().begin();

            em.persist(p);

            em.getTransaction().commit();

            System.out.println(p.getName() + " ajouté avec succès");

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }

            e.printStackTrace();

        } finally {
            em.close();
        }
    }

    //Find
    public Produit FindData(int id){
        EntityManager em = JpaUtil.getEm();
        Produit p = em.find(Produit.class,id);
        em.close();
        return p;

    }
    //Select
    public List<Produit> getAlData(){
        EntityManager em = JpaUtil.getEm();
        List<Produit> produit = em.createQuery("select p from Produit p" ,Produit.class).getResultList();
        em.close();
        return produit;
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

    public void SupprimerProduit(int id){
        EntityManager em = JpaUtil.getEm();
        em.getTransaction().begin();
        Produit p = em.find(Produit.class, id);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }


}
