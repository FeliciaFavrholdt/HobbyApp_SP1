package dk.favrholdt.dao.implementations;

import dk.favrholdt.dao.DAO;
import dk.favrholdt.entities.Zipcode;
import jakarta.persistence.EntityManagerFactory;

public class ZipcodeImpl implements DAO<Zipcode> {

    private static EntityManagerFactory emf;

    private static ZipcodeImpl instance;

    public static ZipcodeImpl getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new ZipcodeImpl();
        }
        return instance;
    }

    private ZipcodeImpl() {
    }

    @Override
    public Zipcode create(Zipcode zipcode) {
        return null;
    }

    @Override
    public Zipcode read(Object id) {
        return null;
    }

    @Override
    public Zipcode update(Zipcode zipcode) {
        return null;
    }

    @Override
    public void delete(Object id) {

    }
}
