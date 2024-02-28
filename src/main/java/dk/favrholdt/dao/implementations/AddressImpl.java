package dk.favrholdt.dao.implementations;

import dk.favrholdt.dao.DAO;
import dk.favrholdt.entities.Address;
import jakarta.persistence.EntityManagerFactory;

public class AddressImpl implements DAO<Address> {

    private static EntityManagerFactory emf;

    private static AddressImpl instance;

    public static AddressImpl getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new AddressImpl();
        }
        return instance;
    }

    private AddressImpl() {
    }

    @Override
    public Address create(Address address) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(address);
            em.getTransaction().commit();
            return address;
        }
    }

    @Override
    public Address read(Object id) {
        try (var em = emf.createEntityManager()) {
            return em.find(Address.class, id);
        }
    }

    @Override
    public Address update(Address address) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.merge(address);
            em.getTransaction().commit();
            return address;
        }
    }

    @Override
    public void delete(Object id) {
        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Address address = em.find(Address.class, id);
            em.remove(address);
            em.getTransaction().commit();
        }
    }
}