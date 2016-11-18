/**
 * @author Player
 */
public class Player {

// Private Fields

    private int xPlayerPosition;
    private int yPlayerPosition;
    private int zPlayerPosition;
    private boolean alive;

// Constructors

    /*
    Player constructor making the objects position the starting position
     */
    public Player(){
        xPlayerPosition = 0;
        yPlayerPosition = 0;
        zPlayerPosition = 0;
        alive = true;
    }

// Get Methods

    public int getxPlayerPosition(){
        return xPlayerPosition;
    }

    public int getyPlayerPosition(){
        return yPlayerPosition;
    }

    public int getzPlayerPosition(){
        return zPlayerPosition;
    }

    public boolean getAlive(){
        return alive;
    }
}
