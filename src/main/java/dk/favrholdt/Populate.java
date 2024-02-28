/*
package dk.favrholdt;

import dk.favrholdt.config.HibernateConfig;
import dk.favrholdt.dao.implementations.AccountImpl;
import dk.favrholdt.dao.implementations.UserImpl;
import dk.favrholdt.entities.*;
import dk.favrholdt.errorhandling.LogExample;
import jakarta.persistence.EntityManagerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;

public class Populate {

    static EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();
    private static final Logger logger = LogManager.getLogger(LogExample.class);

    public static void main(String[] args) {

        insertData(emf);

    }


    private static void insertData(EntityManagerFactory emf) {

        UserImpl user = UserImpl.getInstance(emf);
        AccountImpl account = AccountImpl.getInstance(emf);

        logger.debug("Inserting data into the database");

        // populate the database with data



        account.create(new Account(user1.getUsername(), LocalDate.of(2023, 8, 25), user1.getAccount().getAccountDetail(), user1.getAccount().getHobbies()));
        account.create(new Account(user2.getUsername(), LocalDate.of(2024, 5, 11), user2.getAccount().getAccountDetail(), user2.getAccount().getHobbies()));

        logger.debug("Data inserted into the database");

    }

}*/
