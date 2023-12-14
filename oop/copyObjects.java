public class copyObjects {
    
    public static void main(String[] args) {

        System.out.println();

        Gari gari1 = new Gari("Chevrolet", "Camero", 2021);
        //Gari gari2 = new Gari("Ford", "Mustang", 2023);

        //gari2.copy(gari1); // customized copy function or method
        Gari gari2 = new Gari(gari1);

     
        System.out.println(gari1);
        System.out.println(gari2);

        System.out.println();

        System.out.println(gari1.getMake());
        System.out.println(gari1.getModel());
        System.out.println(gari1.getYear());

        System.out.println();

        System.out.println(gari2.getMake());
        System.out.println(gari2.getModel());
        System.out.println(gari2.getYear());

        System.out.println();

    }
}
