package Task3;

public class Room {

    public String roomName;
    public String direction;
    public String roomColor;

    public Room(String direction, String roomName) {
        this.direction = direction;
        setRoomColorByDirection(direction);
        this.roomName = roomName;
    }

    private void setRoomColorByDirection(String direction) {
        if(direction.equals("North")) {
            this.roomColor = "white";
        } else if (direction.equals("South")) {
            this.roomColor = "green";
        } else if (direction.equals("West")) {
            this.roomColor = "blue";
        } else if (direction.equals("East")) {
            this.roomColor = "red";
        } else
            System.out.println("You haven't specified a valid direction");
    }

    public void setRoomColor(String roomColor) {
        this.roomColor = roomColor;
    }

    @Override
    public String toString() {
        return "The color of the " + roomName + " is " + roomColor + "\n";
    }

}
