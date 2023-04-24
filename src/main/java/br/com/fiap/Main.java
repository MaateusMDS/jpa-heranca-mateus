package br.com.fiap;

import br.com.fiap.pessoa.model.PF;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("maria-db");
        EntityManager entityManager = factory.createEntityManager();

        PF mateus = new PF();
        mateus.setCPF("123123123");
        mateus.setRG("1231232");
        mateus.setNome("Mateus Mendes dos Santos");
        mateus.setNascimento(LocalDate.of(2004, 7, 24));

        entityManager.getTransaction().begin();
        entityManager.persist(mateus);
        entityManager.getTransaction().commit();

    }

}