import java.util.Scanner;
/**
 * @author Input
 */
public class Input {

    public static String getInput(){
        Scanner PlayerInput = new Scanner(System.in);
        System.out.print("> ");
        String input = PlayerInput.nextLine();
        input.toLowerCase();
        return input;
    }
}
