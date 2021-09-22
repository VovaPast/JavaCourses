package comporator;

import models.Service;

import java.util.Comparator;

public class ServicePartitionComparator implements Comparator<Service> {

    @Override
    public int compare(Service service, Service anotherService) {
        return service.getPartition().compareTo(anotherService.getPartition());
    }

}
