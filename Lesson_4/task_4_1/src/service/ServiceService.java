package service;

import models.Service;

public interface ServiceService {

    Service saveService(Service service);

    boolean removeService(Service service);

    boolean updateService(Service service);

    Service getServiceById(long id);

    Service[] getAllService();

    Service[] getAllServiceSortedByPrice();

    Service[] getAllServiceSortedByPartition();

    Service[] getClientService(long clientId);

    long getClientServicePrice(long clientId);

    Service[] getClientsServiceSortedByPrice(long clientId);

    Service[] getClientsServiceSortedByDate(long clientId);

    boolean changePrice(long id, long price);

}
