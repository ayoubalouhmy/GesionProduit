package com.example.entity.Util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class JpaUtil {
    public static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("gestionStock");

    public static EntityManager getEm(){
        return emf.createEntityManager();
    }
}
