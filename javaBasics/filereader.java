import java.io.FileReader;

public class filereader {
    public static void main(String[] args) {

        try {
            System.out.println();

            FileReader reader = new FileReader("C:\\Users\\t\\OneDrive\\Desktop\\practiceWrite.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();

            }

            reader.close();
            System.out.println();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
