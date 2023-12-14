
/*
 An abstract representation of file and directory pathnames.

User interfaces and operating systems use system-dependent pathname strings to name files and directories. This 
class presents an abstract, system-independent view of hierarchical pathnames. An abstract pathname has two 
components:
 */
import java.io.File;

public class fileClass {
    public static void main(String[] args) {
        // File file = new File("C:\\Users\\t\\OneDrive\\Desktop\\secrect_message.txt");
        File file = new File("secrect_message.txt");
        

        if (file.exists()) {
            System.out.println();
            System.out.println(file + " exists");
            System.out.println();
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();

        } else {
            System.out.println(file + " does not exist");
        }

    }
}
