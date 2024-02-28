package dk.favrholdt.dao;

public interface DAO<T> {

    // CRUD operations
    T create(T t);
    T read(Object id);
    T update(T t);
    void delete(Object id);
}
