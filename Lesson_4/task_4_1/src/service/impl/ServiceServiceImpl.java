package service.impl;

import comporator.ServicePriceComparator;
import database.ServiceDatabase;
import models.Client;
import models.Service;
import repository.ServiceRepository;
import service.AbsService;
import service.ClientService;
import service.ServiceService;

import java.util.Arrays;
import java.util.Comparator;

public class ServiceServiceImpl extends AbsService implements ServiceService {

    private final ServiceRepository serviceRepository;
    private final ClientService clientService;

    public ServiceServiceImpl(ServiceRepository serviceRepository, ClientService clientService) {
        this.serviceRepository = serviceRepository;
        this.clientService = clientService;
    }

    @Override
    public Service saveService(Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public boolean removeService(Service service) {
        return serviceRepository.remove(service);
    }

    @Override
    public boolean updateService(Service service) {
        return serviceRepository.update(service);
    }

    @Override
    public Service getServiceById(long id) {
        return serviceRepository.getById(id);
    }

    @Override
    public Service[] getAllService() {
        return trimToSize();
    }

    @Override
    public Service[] getAllServiceSortedByPrice() {
        return (Service[]) sortByComparator(new ServicePriceComparator());
    }

    @Override
    public Service[] getAllServiceSortedByPartition() {
        return (Service[]) sortByComparator(new ServicePriceComparator());
    }

    @Override
    public Service[] getClientService(long clientId) {
        final Client client = clientService.getClientById(clientId);
        if (client == null) {
            return null;
        }
        return client.getService();
    }

    @Override
    public long getClientServicePrice(long clientId) {
        final Client client = clientService.getClientById(clientId);
        if (client == null) {
            return 0;
        }
        long sum = 0;
        for (Service service : client.getService()) {
            if (service != null) {
                sum += service.getPrice();
            }
        }
        return sum;
    }

    @Override
    public Service[] getClientsServiceSortedByPrice(long clientId) {
        final Service[] services = getClientService(clientId);
        Arrays.sort(services, Comparator.nullsLast(new ServicePriceComparator()));
        return services;
    }

    @Override
    public Service[] getClientsServiceSortedByDate(long clientId) {
        final Service[] services = getClientService(clientId);
        Arrays.sort(services, Comparator.nullsLast(new ServicePriceComparator()));
        return services;
    }

    @Override
    public boolean changePrice(long id, long price) {
        final Service service = getServiceById(id);
        if (service != null) {
            service.setPrice(price);
            return true;
        }
        return false;
    }

    @Override
    protected Service[] trimToSize() {
        final Service[] services = ServiceDatabase.getService();
        int capacity = 0;
        for (Service room : services) {
            if (room != null) {
                capacity++;
            }
        }
        Service[] tempArray = new Service[capacity];
        int index = 0;
        for (Service service : services) {
            if (service != null) {
                tempArray[index++] = service;
            }
        }
        return Arrays.copyOf(tempArray, tempArray.length);
    }

}
