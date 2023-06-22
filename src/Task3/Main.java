package Task3;

public class Main {

    public static void main(String[] args) {

        House house = new House("Orange", "Wood", "Ivan Petrov");
        Room bathroom = new Room("North", "Bathroom");
        Room sleepingRoom = new Room("East", "Sleeping Room");
        Room livingRoom = new Room("West", "Living Room");
        Room kitchen = new Room("South", "Kitchen");

        house.rooms[0] = bathroom;
        house.rooms[1] = sleepingRoom;
        house.rooms[2] = livingRoom;
        house.rooms[3] = kitchen;

        for(Room room : house.rooms) {
            System.out.println(room);
        }

        System.out.println("---Repainting living room---");
        System.out.println();

        livingRoom.setRoomColor("yellow");

        for(Room room : house.rooms) {
            System.out.println(room);
        }

        System.out.println("The name of the builder is " + house.getNameOfBuilder());

        System.out.println("Program terminated");

    }

}
