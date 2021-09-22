import constants.Constants;
import models.Essence;
import repository.ClientRepository;
import repository.HistoryRepository;
import repository.RoomRepository;
import repository.ServiceRepository;
import repository.impl.ClientRepositoryImpl;
import repository.impl.HistoryRepositoryImpl;
import repository.impl.RoomRepositoryImpl;
import repository.impl.ServiceRepositoryImpl;
import service.ClientService;
import service.RoomService;
import service.ServiceService;
import service.impl.ClientServiceImpl;
import service.impl.HistoryServiceImpl;
import service.impl.RoomServiceImpl;
import service.impl.ServiceServiceImpl;

public class Main {

    private static void printEssence(Essence[] essences) {
        for (Essence essence : essences) {
            System.out.println(essence);
        }
    }

    public static void main(String[] args) {

        final ClientRepository clientRepository = new ClientRepositoryImpl();
        final ClientService clientService = new ClientServiceImpl(clientRepository);
        final RoomRepository roomRepository = new RoomRepositoryImpl();
        final RoomService roomService = new RoomServiceImpl(roomRepository);
        final ServiceRepository serviceRepository = new ServiceRepositoryImpl();
        final ServiceService serviceService = new ServiceServiceImpl(serviceRepository, clientService);
        final HistoryRepository historyRepository = new HistoryRepositoryImpl();
        final HistoryServiceImpl historyService = new HistoryServiceImpl(historyRepository);

        System.out.println("Список номеров ");
        printEssence(roomService.getAllRooms());
        System.out.println();

        System.out.println("Список номеров по цене ");
        printEssence(roomService.getFreeRoomsSortedByPrice());
        System.out.println();

        System.out.println("Список номеров по вместимости, ");
        printEssence(roomService.getAllRoomsSortedByCapacity());
        System.out.println();

        System.out.println("Сортировка услуг по цене ");
        printEssence(serviceService.getAllServiceSortedByPrice());
        System.out.println();

        System.out.println("Сортировка клиентов по последней дате прибывания ");
        printEssence(clientService.getAllClientsSortedByEndDate());
        System.out.println();

        System.out.println("Посмотреть детали отдельного номера 10");
        printEssence(historyService.getRoomHistory(Constants.ROOM_ID));
        System.out.println();

    }

}
