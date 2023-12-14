import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class jAudio {
    public static void main(String[] args)
            throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {
        File audioFile = new File("speakTruth.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        Clip audioClip = AudioSystem.getClip();
        audioClip.open(audioStream);
        audioClip.loop(Clip.LOOP_CONTINUOUSLY);

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                long microsecondPosition = audioClip.getMicrosecondPosition();
                long minutes = TimeUnit.MICROSECONDS.toMinutes(microsecondPosition);
                long seconds = TimeUnit.MICROSECONDS.toSeconds(microsecondPosition) -
                        TimeUnit.MINUTES.toSeconds(minutes);
                System.out.print("\rCurrent time: " + String.format("%02d:%02d", minutes, seconds));
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you like to continue listening to this music? (yes/no)");

        while (audioClip.isActive()) {
            if (scanner.hasNextLine()) {
                String answer = scanner.nextLine().toLowerCase();
                if (answer.equals("yes")) {
                    System.out.println("Current time: " +
                            String.format("%02d:%02d",
                                    TimeUnit.MICROSECONDS.toMinutes(audioClip.getMicrosecondPosition()),
                                    TimeUnit.MICROSECONDS.toSeconds(audioClip.getMicrosecondPosition()) -
                                            TimeUnit.MINUTES.toSeconds(TimeUnit.MICROSECONDS
                                                    .toMinutes(audioClip.getMicrosecondPosition()))));
                    System.out.println("Do you like to continue listening to this music? (yes/no)");
                } else if (answer.equals("no")) {
                    break;
                }
            }
        }

        timer.cancel();
        System.out.println("\nMusic stopped.");
        audioClip.stop();

        System.out.println("Bye for now");
        scanner.close();
    }
}
