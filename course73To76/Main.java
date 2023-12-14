/* project name: Java method chaining
method chaing = a common syntax for invoking multiple method calls in OOP
              = condense code into less lines
*/
public class Main {

    public static void main(String[] args) {

        System.out.println();
        String name = "Dipu";

        //name = name.concat(" Singha");
        //name = name.toUpperCase();
        //name = name.trim();

        name = name.concat(" Singha  ").toUpperCase().trim();

        System.out.println(name);
        
        System.out.println();
    }
}