package comporator;

import models.Client;

import java.util.Comparator;

public class ClientEndDateComparator implements Comparator<Client> {

    @Override
    public int compare(Client client, Client anotherClient) {
        return client.getEndDate().compareTo(anotherClient.getEndDate());
    }
}

