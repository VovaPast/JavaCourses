package database;

public class IDGenerator {

    private static int id = 0;

    public static int generateID() {
        return ++id;
    }

}
