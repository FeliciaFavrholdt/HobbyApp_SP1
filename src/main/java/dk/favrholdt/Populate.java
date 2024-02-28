package dk.favrholdt;

import dk.favrholdt.config.HibernateConfig;
import dk.favrholdt.entities.AccountDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Populate {


    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();
        insertData(emf);
    }


    private static void insertData(EntityManagerFactory emf) {
        // populate the database with data

        }
    }

}
