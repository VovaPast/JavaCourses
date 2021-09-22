package service.impl;

import comporator.HistoryComparator;
import database.HistoryDatabase;
import models.Client;
import models.History;
import repository.HistoryRepository;
import service.AbsService;
import service.HistoryService;

import java.util.Arrays;

public class HistoryServiceImpl extends AbsService implements HistoryService {

    private static final int LAST_CLIENTS_COUNT = 3;
    private final HistoryRepository historyRepository;

    public HistoryServiceImpl(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    @Override
    public History saveHistory(History history) {
        return historyRepository.save(history);
    }

    @Override
    public boolean updateHistory(History history) {
        return historyRepository.update(history);
    }

    @Override
    public boolean removeHistory(History history) {
        return removeHistory(history);
    }

    @Override
    public History getById(long id) {
        return historyRepository.getById(id);
    }

    @Override
    public History[] getAllHistories() {
        return trimToSize();
    }

    @Override
    public History[] getLastClients(long roomId) {
        final History[] histories = getRoomHistory(roomId);
        Arrays.sort(getRoomHistory(roomId), new HistoryComparator().reversed());
        return Arrays.copyOf(histories, LAST_CLIENTS_COUNT);
    }

    @Override
    public History[] getRoomHistory(long roomId) {
        final History[] histories = getAllHistories();
        int count = 0;
        for (History history : histories) {
            if (history.getRoomId() == roomId) {
                count++;
            }
        }
        final History[] currentRoomHistories = new History[count];
        count = 0;
        for (History history : histories) {
            currentRoomHistories[count++] = history;
        }
        return currentRoomHistories;
    }

    @Override
    protected History[] trimToSize() {
        final History[] history = HistoryDatabase.getHistory();
        int capacity = 0;
        for (History histories : history) {
            if (histories != null) {
                capacity++;
            }
        }
        History[] tempArray = new History[capacity];
        int index = 0;
        for (History histories : history) {
            if (histories != null) {
                tempArray[index++] = histories;
            }
        }
        return Arrays.copyOf(tempArray, tempArray.length);
    }

}

