// java object passing: example. Pass objects as arguments

public class practice {
    public static void main(String[] args) {

        System.out.println();

        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);

        System.out.println();
    }
}

class Garage {

    void park(Car car) {
        System.out.println("The " + car.name + " is parked in the garage");
    }
}

class Car {
    String name;

    Car(String name1) {
        this.name = name1;
    }
}
