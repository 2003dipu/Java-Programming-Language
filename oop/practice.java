public class practice {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        garage.park(car1);

    }

}

class Garage {

    void park(Car car) {
        System.out.println("The " + car.name + " is parked in the garage");

    }

}

class Car {
    String name;

    Car(String name) {
        this.name = name;
    }

}
