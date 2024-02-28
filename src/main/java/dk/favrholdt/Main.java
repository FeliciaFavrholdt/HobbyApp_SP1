package dk.favrholdt;

import dk.favrholdt.config.HibernateConfig;
import dk.favrholdt.entities.Account;
import dk.favrholdt.entities.AccountDetail;
import dk.favrholdt.enums.Gender;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {;

        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();

        try(EntityManager em = emf.createEntityManager()) {

            Account a1 = new Account("mads", LocalDate.now(), null, null);
            AccountDetail ad1 = new AccountDetail("Mads", "Favrholdt", "mf@gmail.com", "22566543", Gender.MALE, LocalDate.of(1990, 10, 10));

            a1.addAccountDetail(ad1);

            em.getTransaction().begin();
            em.persist(a1);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }


    }
}
