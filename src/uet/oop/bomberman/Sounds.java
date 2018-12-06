package uet.oop.bomberman;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sounds {

    public static Clip getClip(String name) {

        try {
            URL url = Sounds.class.getResource("/sounds/" + name +".wav");
            AudioInputStream stream = AudioSystem.getAudioInputStream(url);
            //trinh choi nhac
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
//            clip.loop(Clip.LOOP_CONTINUOUSLY);
//            clip.start();
            return clip;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
