package service;

import models.History;

public interface HistoryService {

    History saveHistory(History history);

    boolean updateHistory(History history);

    boolean removeHistory(History history);

    History getById(long id);

    History[] getAllHistories();

    History[] getRoomHistory(long roomId);

    History[] getLastClients(long roomId);

}
