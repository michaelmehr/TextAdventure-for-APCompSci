/**
 * @author Room
 */
public class Room {

// Private Fields

    private int xRoomPosition;
    private int yRoomPosition;
    private int zRoomPosition;
    private String roomName;

// Constructors

    /*
    Creates a room object based on two int arguments for position
        and a string argument for the name of the room.
     */
    public Room(int x, int y, String n){
        x = xRoomPosition;
        y = yRoomPosition;
        n = roomName;
    }

// Get Methods

    public int getxRoomPosition(){
        return xRoomPosition;
    }

    public int getyRoomPosition(){
        return yRoomPosition;
    }

    public int getzRoomPosition(){
        return zRoomPosition;
    }

    public String getRoomName(){
        return roomName;
    }
}
