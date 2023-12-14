public class stringMethod {
    public static void main(String[] args) {
        // string = a reference data type that can store one or more characters
        // reference data types have access to useful methods
        String name = "  Rosmi Sinha  ";

        // boolean result = name.equals("Rosmi");
        // int result = name.length();
        // char result = name.charAt(5);
        // int result = name.indexOf("i");// the first i is at index 4
        // int result = name.indexOf(" ");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();
        String result = name.replace("h", "n");

        System.out.println(name);
        System.out.println(result);

    }
}
