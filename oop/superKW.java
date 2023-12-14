// super = keyword refers to the superclass (paraent) of an object
// very similar to the "this" keyword

public class superKW {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 43, "everything");

       System.out.println(hero2.toString());

    }
}
