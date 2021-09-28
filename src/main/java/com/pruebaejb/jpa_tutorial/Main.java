package com.pruebaejb.jpa_tutorial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pryet
 */
public class Main {

    public static void main(String[] args) {

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("prod");
//        EntityManager em = emf.createEntityManager();
//        //em.getTransaction().begin();
//       // em.persist(new Estudiante("Paco2","sfdsad2","apellido2", 25));
//       // em.persist(new Estudiante("Paco3","sfdsad3","apellido3", 25));
//       // em.persist(new Estudiante("Paco4","sfdsad4","apellido4", 25));
//        
//        //em.persist(new Estudiante("xxx","xxxx", 25));
//        System.out.println(em.createQuery("SELECT e FROM Estudiante e").getResultList());
//
//       // em.getTransaction().commit();
//        em.close();
//        emf.close();
//    }
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("prod");
//        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//        Estudiante s = em.find(Estudiante.class, 3);
//        System.out.println("Before Updation");
//        System.out.println("Student id = " + s.getId());
//        System.out.println("Student Name = " + s.getNombre());
//        System.out.println("Student Age = " + s.getEdad());
//
//        s.setEdad(30);
//        em.getTransaction().commit();
//        em.close();
//        emf.close();
//        System.out.println("After Updation");
//        System.out.println("Student id = " + s.getId());
//        System.out.println("Student Name = " + s.getNombre());
//        System.out.println("Student Age = " + s.getEdad());



//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("prod");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//
//        Estudiante s = em.find(Estudiante.class, 200);
//        em.remove(s);
//        em.getTransaction().commit();
//        emf.close();
//        em.close();

        Address a=new Address(0, "Mallorca", "España");
        Address a2=new Address(1, "Tenerife", "España");
        Address a3=new Address(2, "El volcan", "España");
        List<Address> lista=new ArrayList<>();
        lista.add(a);
        lista.add(a2);
        lista.add(a3);
        Estudiante e=new Estudiante();
        e.setAddress(a);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("prod");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        System.out.println(" "+ em.find(Estudiante.class, 9).getAddress());
        System.out.println(em.createQuery("SELECT e FROM Estudiante e").getResultList());

    }


}
