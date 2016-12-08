/**
 * @author Michael
 */
public class MainGame {

// Main Method

    public static void main(String[] args) {
        final int mapWidth = 3;
        final int mapHeight = 3;

        int xPosition = 0;
        int yPosition = 0;
        boolean alive = true;
        Inventory mainInventory = new Inventory();

        beginGame();
        System.out.println("You are in a dark room, with a faint light spilling through a small doorway");
        while(alive){
            String action = Input.getInput();
            switch(action){
                case "help":
                    System.out.println("N/S/E/W = Move north/south/east/west \n" +
                            "TAKE <ITEM> = Take specified item\n" +
                            "CLOSE <ITEM> = Close specified item\n" +
                            "OPEN <ITEM> = Open specified item\n" +
                            "LOOK = Examine current location\n" +
                            "ATTACK <TARGET> = Attack specified target\n" +
                            "U/UP/D/DOWN = Move up or down\n" +
                            "READ <TARGET> = Read specified target\n" +
                            "TALK <TARGET> = Speak to specified target\n" +
                            "INVENTORY = Inspect inventory\n" +
                            "QUIT = Quit game");
                    break;
                case "look":
                    break;
                case "quit":
                    alive = false;
                    break;
                case "s":
                case "south":
                    if(yPosition > 0){
                        yPosition--;
                    }
                    else{
                        System.out.println("You cannot go that way");
                    }
                    break;
                case "w":
                case "west":
                    if(xPosition > 0){
                        xPosition--;
                    }
                    else{
                        System.out.println("You cannot go that way");
                    }
                    break;
                case "e":
                case "east":
                    if(xPosition < 3){
                        xPosition++;
                    }
                    else{
                        System.out.println("You cannot go that way");
                    }
                    break;
                case "n":
                case "north":
                    if(yPosition < 3){
                        yPosition++;
                    }
                    else{
                        System.out.println("You cannot go that way");
                    }
                    break;
                case "u":
                case "up":
                    break;
                case "d":
                case "down":
                    break;
                case "inventory":
                    break;
                default:
                    String itemInput;
                    itemInput = action.substring(5,10);
                    switch(action.substring(0,4)){
                        case "take ":
                            takeItem(itemInput);
                            break;
                        case "open ":
                            openItem(itemInput);
                            break;
                        case "read ":
                            readItem(itemInput);
                            break;
                        case "talk ":
                            talkWith(itemInput);
                            break;
                        default:
                            itemInput = action.substring(6,11);
                            switch(action.substring(0,5)){
                                case "close ":
                                    closeItem(itemInput);
                                    break;
                                default:
                                    itemInput = action.substring(7,12);
                                    switch(action.substring(0,6)){
                                        case "attack ":
                                            attackTarget(itemInput);
                                            break;
                                        default:
                                            itemInput = null;
                                            System.out.println("That command is not recognized");
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        System.exit(0);
    }

    /**
     * Prints game introduction
     */
    public static void beginGame(){
        System.out.println("GAME START");
        System.out.println(" \n -------------------- \n");
        Sounds.playTitleMusic();
    }

    public static void takeItem(String itemTake){

    }

    public static void openItem(String itemOpen){

    }

    public static void readItem(String itemRead){

    }

    public static void talkWith(String person){

    }

    public static void closeItem(String itemClose){

    }

    public static void attackTarget(String target){

    }

}
