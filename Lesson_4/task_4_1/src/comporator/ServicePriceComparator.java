package comporator;

import models.Service;

import java.util.Comparator;

public class ServicePriceComparator implements Comparator<Service> {

    @Override
    public int compare(Service service, Service anotherService) {
        return (int) (service.getPrice() - anotherService.getPrice());
    }
}
