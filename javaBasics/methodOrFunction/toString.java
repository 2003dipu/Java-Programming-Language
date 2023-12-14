public class toString {
    public static void main(String[] args) {
        System.out.println();
        // toString() = special method that all objects inherit, that returns a string that "textually represents"
        // an object. Can be used both implicitly and explicitly

        Car car1 = new Car();

        /*
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);
        */

        //System.out.println(car1.toString());
        System.out.println(car1);

        System.out.println();
    }
}
