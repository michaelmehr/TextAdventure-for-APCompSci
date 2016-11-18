/**
 * @author Michael
 */
public class MainGame {

// Main Mehtod

    public static void main(String[] args) {
        beginGame();
        System.out.println("You are in a dark room, with a faint light spilling through a small doorway");

    }

    /*
    Creates player and inventory objects, and prints the introduction
     */
    public static void beginGame(){
        Player Player1 = new Player();
        Inventory mainInventory = new Inventory();
        System.out.println("Welcome to game!");
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");
    }

    /*
    This method takes a character input and changes the player object's position
    based on the input
     */
    public void changePosition(char c){
        if(c == 'n'){

        }
        if(c == 's'){

        }
        if(c == 'e'){

        }
        if(c == 'w'){

        }
        if(c == 'u'){

        }
        if(c == 'd'){

        }
    }
}
