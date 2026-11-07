package com.example.entity.Util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionStock");

    public static EntityManagerFactory getEm(){
        return emf;
    }
}
