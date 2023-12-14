public class switchstatement {
    public static void main(String[] args) {
        // switch = statement that allows a variable to be tested for equality against a
        // list of values
        // it's often used as an alternative to lots of elseif statements
        String day = "jambura";
        switch (day) {
            case "Sunday":
                System.out.println("It's Sunday");
                break;
            case "Monday":
                System.out.println("It's Monday");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday");
                break;
            case "Thursday":
                System.out.println("It's Thursday");
                break;
            case "Friday":
                System.out.println("It's Friday");
                break;
            case "Saturday":
                System.out.println("It's Saturday");

            default: System.out.println(day+" is not a day!");
                break;
        }
    }
}
