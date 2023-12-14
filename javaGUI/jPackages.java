
import java.util.Scanner;


public class jPackages {

    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("What's your name dear?: ");
        String userName = myObj.nextLine();
        System.out.println("Hello " + userName);

        myObj.close();
    }

    
}

/*
import java.util.Scanner;

In the example above, java.util is a package, while Scanner is a class of the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner 
class documentation. In our example, we will use the nextLine() method, which is used to read a complete line:

There are many packages to choose from. In the previous example, we used the Scanner class from the java.util 
package. This package also contains date and time facilities, random-number generator and other utility classes.

To import a whole package, end the sentence with an asterisk sign (*). The following example will import ALL the 
classes in the java.util package:
import java.util.*;
 */