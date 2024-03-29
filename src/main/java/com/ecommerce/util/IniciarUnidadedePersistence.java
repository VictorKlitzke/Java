package com.ecommerce.util;

import com.ecommerce.model.Produto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class IniciarUnidadedePersistence {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Ecommerce-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Produto produto = entityManager.find(Produto.class, 1);
        System.out.println(produto.getNome());
        System.out.println(produto.getDescricao());

        entityManager.close();
        entityManagerFactory.close();
    }

}
