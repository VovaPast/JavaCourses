package database;

import constants.Constants;
import enums.ServicePartition;
import models.Service;

public class ServiceDatabase {

    private static Service[] services;

    public static Service[] getService() {
        if (services == null) {
            initServiceDatabase();
        }
        return services;
    }

    public static void setService(Service[] services) {
        ServiceDatabase.services = services;
    }

    private static void initServiceDatabase() {

        services = new Service[Constants.INITIAL_ARRAY_CAPACITY];

        Service  service1 = new Service(300, "Шведский стол", ServicePartition.FOOD);
        Service  service2 = new Service(150, "Обслуживание номера", ServicePartition.OTHER);
        Service  service3= new Service(200, "Уборка номера", ServicePartition.OTHER);
        Service  service4 = new Service(125, "Бассеин", ServicePartition.OTHER);

        service1.setId(IDGenerator.generateID());
        service2.setId(IDGenerator.generateID());
        service3.setId(IDGenerator.generateID());
        service4.setId(IDGenerator.generateID());

        services[0] = service1;
        services[1] = service2;
        services[2] = service3;
        services[3] = service4;
    }

}

