public class jArray{
    public static void main(String[] args){
        // array = used to store multiple values in a single variable
        String[] cars = {"Jambura", "Thaypong", "Hanu", "Punimalpy", "Chokha Lahu", "Chambhut"};
        int[] amount = {500, 230, 432, 2345, 1234, 399};
        double[] temperature = {34.2, 12.22, 5.6, 10.07};
        char[] gpa = {'A', 'B', 'C', 'F'};
        String[] jobs = new String[5];
        jobs[0] = "Consultant";
        jobs[1] = "Selling";
        jobs[2] = "Courier";
        jobs[3] = "Advisor";
        jobs[4] = "Designer";
        
        for(int i = 0; i< jobs.length; i++){
            System.out.println(jobs[i]);
        }

        System.out.println(cars[0]);
    }
}