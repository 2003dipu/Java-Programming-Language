// project name: Java Serialization

// Serialization = the process of converting an object into a byte stream. (Think of this as if you're saving a
//                 file with the object's information) -> file extension: .ser
// Deserialization = The reverse process of converting a byte stream into an object(Think of this as you're loading
//                    a saved file) 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainSerialization {

    public static void main(String[] args) throws IOException {

        User user = new User();

        user.name = "Bro";
        user.password = "I<Pizza";

        //user.sayHello();
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out= new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved");
        
        

    }
    
}
