import interfaces.IPutInTheRoom;
import interfaces.IRemoveFromRoom;

public class client extends hotel implements IPutInTheRoom , IRemoveFromRoom {
    private  String name;
    private  String surname;

    public client(String name, String surname,int numRoom, float priceRoom) {

        super(numRoom, priceRoom);
        this.name = name;
        this.surname = surname;

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public void putInRoom() {
        System.out.println(name + " " + surname +" был(a) добавлен(a) в комнату № "+ getNumRoom());
    }
    @Override
    public void removeFromRoom() {
        System.out.println(name + " " + surname +" был(a) выселен(a) из комнаты № "+ getNumRoom());
    }

}