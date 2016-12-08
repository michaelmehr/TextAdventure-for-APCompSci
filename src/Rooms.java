import java.util.ArrayList;

/**
 * @author Rooms
 */
class Rooms {
    public static void build(Room[][] room, final int mapWidth, final int mapHeight){

        for(int i = 0; i < mapWidth; i++){
            for(int j = 0; j < mapHeight; j++){
                room[i][j] = new Room(i, "", "", null);
            }
        }

        room[0][0].setNumber(1);
        room[0][0].setName("Entrance");
        room[0][0].setDescription("Where everyone goes to die");

        room[0][1].setNumber(2);
        room[0][1].setName("Hallway");
        room[0][1].setDescription("You could keep going");

        room[0][2].setNumber(3);
        room[0][2].setName("Fringus");
        room[0][2].setDescription("AHHHHHH");

        room[1][0].setNumber(4);
        room[1][0].setName("Roombus");
        room[1][0].setDescription("Oh no");

        room[1][1].setNumber(5);
        room[1][1].setName("I wish I was dead");
        room[1][1].setDescription("So much pain...");

        room[1][2].setNumber(6);
        room[1][2].setName("The BEST Room");
        room[1][2].setDescription("oh my LORD JESUS CHRIST SAVE ME");

        room[2][0].setNumber(7);
        room[2][0].setName("I forgot to make this one");
        room[2][0].setDescription("Gamergate is real");

        room[2][1].setNumber(8);
        room[2][1].setName("Schluck");
        room[2][1].setDescription("Just... another... room.");

        room[2][2].setNumber(9);
        room[2][2].setName("Last Room");
        room[2][2].setDescription("He eat a cheese");
    }
}

class Room{
    private int number;
    private String name;
    private String description;
    public ArrayList<String> items = new ArrayList<>();

    public Room(int number, String name, String description, ArrayList<String> items){

    }

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }

    public void setItems(String item){
        this.items.add(item);
    }
    public void deleteItems(String item){
        this.items.remove(item);
    }
    public ArrayList<String> getItems(){
        return this.items;
    }
}