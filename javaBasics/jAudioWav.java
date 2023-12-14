
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class jAudioWav {

    public static void main(String[] args) throws IOException {

        try (Scanner input = new Scanner(System.in);
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File("speakTruth.wav"))) {

            Clip music = AudioSystem.getClip();
            music.open(audio); // open the audio stream in the clip
            String answer = "";

            do {
                music.loop(Clip.LOOP_CONTINUOUSLY); // play the audio continuously
                System.out.println("Would like to continue listening to this music?");
                answer = input.next(); // get the user's answer
                if (!answer.equals("yes")) {
                    music.stop();
                    break; // exit the loop
                }
                System.out.println("Enjoy listening");
            } while (true);

        } catch (UnsupportedAudioFileException | LineUnavailableException e) { // catch specific exceptions
            System.out.println(e.getMessage()); // print the exception message
        }
    }
}
