package comporator;

import models.History;

import java.util.Comparator;

public class HistoryComparator implements Comparator<History> {

    @Override
    public int compare(History history, History anotherHistory) {
        return history.getClient().getEndDate().
                compareTo(anotherHistory.getClient().getEndDate());
    }
}