package repository;

import models.History;

public interface HistoryRepository {

    History save(History history);

    boolean update(History history);

    boolean remove(History history);

    History getById(long id);

    History[] getAll();

}
