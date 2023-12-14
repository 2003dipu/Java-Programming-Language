
import javazoom.jl.player.Player; // import the JLayer player class(external library)
import java.io.FileInputStream; // import the file input stream class

public class audioMP3 {

    public static void main(String[] args) {
        try {
            // create a file input stream object for the mp3 file
            FileInputStream fis = new FileInputStream("test.mp3");
            // create a player object with the file input stream
            Player player = new Player(fis);
            // start playing the mp3 file
            player.play();
        } catch (Exception e) {
            // handle any exceptions
            System.out.println(e.getMessage());
        }
    }
}
