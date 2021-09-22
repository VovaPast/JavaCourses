package comporator;

import models.Client;

import java.util.Comparator;

public class ClientLastNameComparator implements Comparator<Client> {

    @Override
    public int compare(Client client, Client anotherClient) {
        return client.getLastName().compareTo(anotherClient.getLastName());
    }

}

