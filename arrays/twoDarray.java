public class twoDarray {
    public static void main(String[] args) {
        // 2D array = an array of arrays
        String[][] cars = new String[4][4];
        cars[0][0] = "A";
        cars[0][1] = "B";
        cars[0][2] = "C";
        cars[0][3] = "D";

        cars[1][0] = "Ranger";
        cars[1][1] = "F-150";
        cars[1][2] = "Ferrari";
        cars[1][3] = "Tesla";

        cars[2][0] = "Lambo";
        cars[2][1] = "Toyota";
        cars[2][2] = "Honda";
        cars[2][3] = "Hero";

        cars[3][0] = "Camero";
        cars[3][1] = "Corvette";
        cars[3][2] = "Silverado";
        cars[3][3] = "Mustang";

        // or directly instantiate your 2D array like the following
        String[][] cars1 = {    { "A", "B", "C", "D" },
                                { "Ranger", "F-150", "Ferrari", "Tesla" },
                                { "Lambo", "Toyota", "Honda", "Hero" },
                                { "Camero", "Corvette", "Silverado", "Mustang" } 
                            };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                // System.out.print(cars[i][j] + "\t");
                System.out.format("%-13s", cars1[i][j]);
            }
        }
        System.out.println("\n");
    }
}
