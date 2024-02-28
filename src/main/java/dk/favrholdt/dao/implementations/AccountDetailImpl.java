package dk.favrholdt.dao.implementations;

import dk.favrholdt.dao.DAO;
import dk.favrholdt.entities.AccountDetail;
import jakarta.persistence.EntityManagerFactory;

public class AccountDetailImpl implements DAO<AccountDetail> {

    private static EntityManagerFactory emf;

    private static AccountDetailImpl instance;

    public static AccountDetailImpl getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new AccountDetailImpl();
        }
        return instance;
    }

    private AccountDetailImpl() {
    }


    @Override
    public AccountDetail create(AccountDetail accountDetail) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(accountDetail);
            em.getTransaction().commit();
            return accountDetail;
        }
    }

    @Override
    public AccountDetail read(Object id) {
        try (var em = emf.createEntityManager()) {
            return em.find(AccountDetail.class, id);
        }
    }

    @Override
    public AccountDetail update(AccountDetail accountDetail) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.merge(accountDetail);
            em.getTransaction().commit();
            return accountDetail;
        }
    }

    @Override
    public void delete(Object id) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            AccountDetail accountDetail = em.find(AccountDetail.class, id);
            em.remove(accountDetail);
            em.getTransaction().commit();
        }
    }
}