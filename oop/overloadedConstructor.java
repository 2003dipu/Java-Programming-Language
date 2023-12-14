// overloaded constructor = multiple constructor within a class with the same name, but have different parameters
// name + parameter = signature

public class overloadedConstructor {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");
        System.out.println("\nHere are the ingredients of your pizza\n");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        System.out.println();

        Pizza pizza1 = new Pizza();

        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);
        System.out.println();
        
    }
}
