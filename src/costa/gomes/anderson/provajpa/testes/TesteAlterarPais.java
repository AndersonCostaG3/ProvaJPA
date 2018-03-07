/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costa.gomes.anderson.provajpa.testes;

import costa.gomes.anderson.provajpa.modelo.Pais;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gomescosta
 */
public class TesteAlterarPais {
    public static void main (String[] args){
        EntityManagerFactory  emf = Persistence.createEntityManagerFactory("ProvaJPAPU");
        EntityManager em = emf.createEntityManager();
        Pais p = em.find(Pais.class, 3);
        p.setNome("Argentina");
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
