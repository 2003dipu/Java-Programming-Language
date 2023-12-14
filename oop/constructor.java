// constructor = special method that is called when an object is instantiated(created)

public class constructor {
    public static void main(String[] args) {
        String name = "Steve Jobs";
        int age = 150;
        double weight = 65;
        Human human1 = new Human(name, age, weight);
        System.out.println(human1.name);

        name = "Elon Musk";
        age = 50;
        weight = 79;

        Human human2 = new Human(name, age, weight);
        System.out.println(human2.name);
        human2.eat();
        human1.drink();
        human1.eat();

        
    }
}
