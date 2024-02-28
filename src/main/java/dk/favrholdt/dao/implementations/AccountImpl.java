package dk.favrholdt.dao.implementations;

import dk.favrholdt.dao.DAO;
import dk.favrholdt.entities.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class AccountImpl implements DAO<Account> {

    private static EntityManagerFactory emf;
    private static AccountImpl instance;

    public static AccountImpl getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new AccountImpl();
        }
        return instance;
    }

    private AccountImpl() {
    }

    @Override
    public Account create(Account account) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        em.close();
        return account;
    }

    @Override
    public Account read(Object id) {
        EntityManager em = emf.createEntityManager();
        Account account = em.find(Account.class, id);
        em.close();
        return account;

        //use of namedQuery
        //  Query query = em.createNamedQuery("Account.findAll");
        //  List results = query.getResultList();
    }

    @Override
    public Account update(Account account) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(account);
        em.getTransaction().commit();
        em.close();
        return account;
    }

    @Override
    public void delete(Object id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Account account = em.find(Account.class, id);
        em.remove(account);
        em.getTransaction().commit();
        em.close();
    }
}