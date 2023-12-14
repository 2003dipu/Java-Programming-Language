// project name: Java inner class( a class inside of another class or nested class analogous to nested loops)


public class JinnerClass {

    public static void main(String[] args) {
        
        // inner class
        Outside out = new Outside();
        Outside.Inside in = out.new Inside();

        //System.out.println(out.x + in.y);
        in.Greeting();
        
    }
    
}
