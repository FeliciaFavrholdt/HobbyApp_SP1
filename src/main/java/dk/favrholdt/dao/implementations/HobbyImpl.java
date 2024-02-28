package dk.favrholdt.dao.implementations;

import dk.favrholdt.dao.DAO;
import dk.favrholdt.entities.Hobby;
import jakarta.persistence.EntityManagerFactory;

public class HobbyImpl implements DAO<Hobby> {

    private static EntityManagerFactory emf;

    private static HobbyImpl instance;

    public static HobbyImpl getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new HobbyImpl();
        }
        return instance;
    }

    private HobbyImpl() {
    }

    @Override
    public Hobby create(Hobby hobby) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(hobby);
            em.getTransaction().commit();
            return hobby;
        }
    }

    @Override
    public Hobby read(Object id) {
        try (var em = emf.createEntityManager()) {
            return em.find(Hobby.class, id);
        }
    }

    @Override
    public Hobby update(Hobby hobby) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.merge(hobby);
            em.getTransaction().commit();
            return hobby;
        }
    }

    @Override
    public void delete(Object id) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Hobby hobby = em.find(Hobby.class, id);
            em.remove(hobby);
            em.getTransaction().commit();
        }
    }
}