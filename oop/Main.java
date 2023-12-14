public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

       // System.out.println("Car1 attributes\n" + car1.model);
        //System.out.println(car1.make);
        //System.out.println(car1.color);

        //car1.drive();
        //car1.brake();

        Drivers drivers = new Drivers();
        //System.out.println(drivers.name);
        //drivers.driver1();

        Car car2 =new Car();
        System.out.println(car2.price);
        System.out.println(car2.year);


    }
}

class Drivers {
    String name = "Shshil Chondro";
    void driver1() {
        System.out.println("Driver1 charges you $5000 per month");
    }

}
