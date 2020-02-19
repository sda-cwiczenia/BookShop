package bookshop.model.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> get(long id);

    List<T> getAll();

    void saveUpdate(T t);

    void delete(T t);
}

