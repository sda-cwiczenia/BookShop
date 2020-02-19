package bookshop.model.dao;

import bookshop.model.entity.Book;

import java.util.List;
import java.util.Optional;

public class BookDao implements Dao<Book> {


    @Override
    public Optional<Book> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public void save(Book book) {

    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public int add(Book book) {
        return 0;
    }
}
