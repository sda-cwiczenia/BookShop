package bookshop.model.dao;

import bookshop.model.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class BookDao implements Dao<Book> {

    EntityManager entityManager;
    EntityTransaction trn;

    public BookDao() {
        entityManager = Persistence.createEntityManagerFactory("mydatabase")
                .createEntityManager();
        trn = entityManager.getTransaction();
    }

    @Override
    public Optional<Book> get(long id) {
        return Optional.ofNullable(entityManager.find(Book.class, id));
    }

    @Override
    public List<Book> getAll() {
        return entityManager.createQuery("select b from Book b").getResultList();
    }

    @Override
    public void saveUpdate(Book book) {
        trn.begin();
        entityManager.merge(book);
        trn.commit();

    }

    @Override
    public void delete(Book book) {
        trn.begin();
        entityManager.remove(book);
        trn.commit();
    }


}
