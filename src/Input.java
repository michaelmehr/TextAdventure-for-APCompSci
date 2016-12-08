import java.util.Scanner;
/**
 * @author Input
 */
public class Input {

    /*
    * Method requests input for player action, converts input to lowercase,
    *    and returns input as String
    */
    public static String getInput(){
        Scanner PlayerInput = new Scanner(System.in);
        System.out.print("> ");
        String input = PlayerInput.nextLine();
        input.toLowerCase();
        return input;
    }
}
