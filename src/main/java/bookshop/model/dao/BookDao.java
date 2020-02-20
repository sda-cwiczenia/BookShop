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
    public Book get(long id) {
        return entityManager.find(Book.class, id);
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

    public List<Book> getByAuthor(String author) {
        List<Book> books = entityManager.createQuery("select b from Book b where b.author = ?1")
                .setParameter(1,author).getResultList();
        return books;
    }


    public List<Book> getByCountry(String country) {
        return entityManager.createQuery("select b from Book b where country = ?1")
                .setParameter(1,country).getResultList();
    }
}
