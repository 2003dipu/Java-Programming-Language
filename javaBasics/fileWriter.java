import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red\nViolets are blue\nI love you Rosmi Singha\n");
            writer.append("Rosmi Sinha loves me. I love her. We both are going to get married and stay happy");
            writer.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
}
