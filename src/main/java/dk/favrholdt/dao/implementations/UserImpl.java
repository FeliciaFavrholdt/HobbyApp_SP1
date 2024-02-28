package dk.favrholdt.dao.implementations;

import dk.favrholdt.dao.DAO;
import dk.favrholdt.entities.User;
import jakarta.persistence.EntityManagerFactory;

public class UserImpl implements DAO<User> {

    private static EntityManagerFactory emf;

    private static UserImpl instance;

    public static UserImpl getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new UserImpl();
        }
        return instance;
    }

    private UserImpl() {
    }

    @Override
    public User create(User user) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
            return user;
        }
    }

    @Override
    public User read(Object id) {
        try (var em = emf.createEntityManager()) {
            return em.find(User.class, id);
        }
    }

    @Override
    public User update(User user) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
            return user;
        }
    }

    @Override
    public void delete(Object id) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            User user = em.find(User.class, id);
            em.remove(user);
            em.getTransaction().commit();
        }

    }
}
