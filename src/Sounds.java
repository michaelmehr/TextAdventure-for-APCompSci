import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * @author Sounds
 */
public class Sounds {

    public static synchronized void playTitleMusic(){

        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    MainGame.class.getResourceAsStream("media/start.wav"));
            clip.open(inputStream);
            clip.start();
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public static synchronized void playItemPickup(){

        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    MainGame.class.getResourceAsStream("media/inv.wav"));
            clip.open(inputStream);
            clip.start();
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
