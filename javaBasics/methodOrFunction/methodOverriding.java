// method overriding: Declaring a method in sub class, which is already present in parent class. 
// This means that the subclass can change the behavior of the method in a way that is specific to its own needs

public class methodOverriding {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.speak();
        Animal animal = new Animal();
        animal.speak();
        

    }
}
