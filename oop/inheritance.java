// inheritance = the process where one class accquires the attributes and methods of another.

public class inheritance {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.go();

    }
}

class vehicle { // ancestor(giving inheritance): super class or parent class
    double speed;

    void go() {
        System.out.println("This vehicle is moving.");
    }

    void stop() {
        System.out.println("This vehicle is stopped.");
    }
}

class Car extends vehicle { // descendants: sub-class or child class

}

class Bicycle extends vehicle { // descendants: sub-class or child class

}