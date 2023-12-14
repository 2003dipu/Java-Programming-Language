// project name: Java enum = enumerated (ordered listing of items in a collection), 
//grouping of constants behave similarly to objects

enum Planet {
    MERCURRY(1), 
    VENUS(2), 
    EARTH(3), 
    MARS(4), 
    JUPITER(5), 
    SATURN(6), 
    URANUS(7), 
    NEPTUNE(8), 
    PLUTO(9);

    int number;

    Planet(int number){
        this.number = number;
    }
}

public class JEnum {

    public static void main(String[] args) {

        System.out.println();

        Planet myPlanet = Planet.PLUTO;

        canILiveHere(myPlanet);

        System.out.println();
    }

    static void canILiveHere(Planet ourPlanet){

        switch (ourPlanet) {
            case EARTH:
                System.out.println("You can live here");
                System.out.println("This is planet # " + ourPlanet.number);
                break;
        
            default:
                System.out.println("You can't live here ...yet.");
                System.out.println("This is planet # " + ourPlanet.number);
                break;
        }

    }

}
