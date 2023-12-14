// this course is facilitated by w3schols.com



public class Practice {

    //public static void main(String[] args) {

        /*
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = true;
        float f1 = 1e3f; // 1 * 10 ^ 3
        double d1 = 2E4d;
        double tenPower = 3.14159e5;

        System.out.println(f1);
        System.out.println(d1);
        System.out.println(tenPower);
        
        //Widening Casting example
        //Widening casting is done automatically when passing a smaller size type to a larger size type:
        //int myInt = 3;
        //double myDouble = myInt;

        // Narrowing Casting example
        //Narrowing casting must be done manually by placing the type in parentheses in front of the value:
        
        double myDouble = 3.1416;
        int myInt = (int) myDouble;
        double myDivision = 5 / 4;
        System.out.println(myInt);
        System.out.println(myDivision);
        
        String myMessage = "I love you";
        int n = myMessage.length();
        System.out.println("The length of myMessage is " + n);
        
        String txt = "Please locate where 'locate' occurs";
        int m = txt.indexOf("P");
        int n = txt.indexOf("locate");
        int o = txt.indexOf("s");
        System.out.println("The index of 'locate' is " + n);
        System.out.println("The index of 'p' is " + m);
        System.out.println("The index of 's' is " + o);
        
        String name = "Rosmi Sinha";
        name = name.toUpperCase();
        System.out.println(name);
       
        String firstName = "Rosmi ";
        String lastName = "Sinha";
        String fullName = firstName.concat(lastName);
        System.out.println("Her full name is "+fullName);
         

         // backslash escape character(\', \", \\)
        String txt = "We are the so-called \"Vikings\" from the north.";
        String message = "My Mama said \f \"I want you to be successful\" ";
        System.out.println(txt);
        System.out.println(message);

        // backslash escape character(\n, \r, \t, \b, \f)
        

        // Java Math
        double a = 3.14159;
        double b = 3.1416;
        double maxNum = Math.max(a,b);
        System.out.println("The maximum number between " + a + " and " + b + " is " + maxNum);
        System.out.println("The minimum number is " + Math.min(a,b));
        System.out.println("Squared root = " + Math.sqrt(9));
        System.out.println("\nRandom numbers between 0 ~ 1 = " + Math.random());
        System.out.println("Random number between 1 and 100 = " + (int)(Math.random()*101));

        int randomNum1 = (int)(Math.random()*101);
        int randomNum2 = (int)(Math.random()*101);
        int randomNum3 = (int)(Math.random()*101);

        System.out.println(randomNum1);
        System.out.println(randomNum2);
        System.out.println(randomNum3);

        // the next program will generate a random integer between 1 through 6
        Random random = new Random();
        int x = random.nextInt(100)+1;
        System.out.println(x);
        
        int myAge = 20;
        int votingAge = 18;
        boolean validate = myAge >= votingAge;

    if (validate){
        System.out.println("Old enough to vote!");
    }
    else{
        System.out.println("Not old enough to vote!");
    }
   

   
  // nested  loop : best example to understand nexted loops
  // Outer loop
  for (int i = 1; i <= 2; i++) {
      System.out.println("Outer : " + i); // executes 2 times
      // inner loop
      for (int j = 1; j <= 3; j++) {
          System.out.println("Inner: " + j); // executes 6 times (2*3)
      }
  }
  

  // Break and Continue
  for (int i = 0; i < 10; i++) {
      if (i == 4) {
          break;
      }
      System.out.println(i);
  }
  System.out.println("We broke out of the for loop because i = 4\n\n");


  for (int i = 0; i < 10; i++) {
      if (i == 4) {
        System.out.println("We ignored 4 because i = 4");
          continue;
      }
      System.out.println(i);
  }
   


  int[] rollNumbers = {4,6,7,1,12,98,23,50};
  System.out.println(rollNumbers[0]);
  System.out.println("The length of the array is " + rollNumbers.length);
  System.out.println("That means there are " + rollNumbers.length + " elements inside this array");
  
  
  //int[][] = {{9,8,7,6}, {1,2,3}};
      int[] rollNumbers = {4,6,7,1,12,98,23,50};
      for(int i: rollNumbers){
        System.out.println(i);
      }
      for (int i = 0; i < rollNumbers.length; i++) {
        System.out.println(rollNumbers[i]);
        
      }

        int[][] rollNumbers = { { 9, 8, 7, 6 }, { 1, 2, 3 } };

        System.out.println(rollNumbers[0][0]);
        System.out.println(rollNumbers[0][1]);
        System.out.println(rollNumbers[0][2]);
        System.out.println(rollNumbers[0][3]);

        System.out.println(rollNumbers[1][0]);
        System.out.println(rollNumbers[1][1]);
        System.out.println(rollNumbers[1][2]);
        
        myMethod("Rosmi");
        myMethod("Sinha");

        double value = half(9);
        System.out.println("halved = " + value);
        */
    
    /*
        myMethod() is the name of the method
        static means that the method belongs to the Main class and not an object of the Main class. You will learn 
        more about objects and how to access methods through objects later in this tutorial.
        void means that this method does not have a return value. You will learn more about return values later in
         this chapter
         */
        /*
    static void myMethod(String name){
        System.out.println("Hello " + name);
    }
    static double half(double x){
        return x/2;
    }
}
    */

        //int addTwoNumbers(int a, int b);
        //double addTwoNumbers(double a, double b);
        /*

        public static void main(String[] args) {

            System.out.println(addTwoNumbers(5, 8.5));
            
        }
      
        

        static int addTwoNumbers(int a, int b){
            return a + b;
        }
        static double addTwoNumbers(double a, double b){
            return a + b;
        }
       

        public static void main(String[] args) {

            int n = 100;
            System.out.println("Sum of 1 ~ " + n);
            int result = sum(n);
            System.out.println(result);
            myFrame mf = new myFrame();
            mf.getIconImage();
        }

        static int sum(int k) {
            if (k > 0) {
                return k + sum(k-1); // recursion takes place here
            } else {
                return 0;
            }

        }
         

         // static method
        static void myStaticMethod(){
            System.out.println("\n\nStatic methods can be called without creating objects\n\n");
        }
        // public method
        public void myPublicMethod(){
            System.out.println("\n\nPublic methods must be called by creating objects\n\n");
        }

        // main method
        public static void main(String[] args){

            myStaticMethod(); // call the static method

            Practice myClass = new Practice(); // create an object of Practice
            myClass.myPublicMethod(); // call the public method on the object

        }
        

        // Create a fullThrottle() method
        public void fullThrottle() {
            System.out.println("The car is going as fast as it can!");
        }

        // Create a speed() method and add a parameter
        public void speed(int maxSpeed) {
            System.out.println("Max speed is: " + maxSpeed);
        }
        static void printMessage(){
            System.out.println("I am trying to understand how access modifieres work like public, static .etc");
        }

        // Inside main, call the methods on the myCar object
        public static void main(String[] args) {

            Practice myCar = new Practice(); // Create a myCar object
            myCar.fullThrottle(); // Call the fullThrottle() method
            myCar.speed(200); // Call the speed() method
            printMessage();
            

        }
        
        int x; // Create a class attribute or some people call it fields

        public Practice(int y) {
            x = y;
        }

        public static void main(String[] args) {

            Practice myObj = new Practice(5); // Create an object of class Main (This will call the constructor)
            System.out.println(myObj.x); // Print the value of x
        }
        */

        int modelYear;
        String modelName;

        Practice(int year, String name){
            modelYear = year;
            modelName = name;
        }

        public static void main(String[] args) {
            
            Practice myObj = new Practice(2023, "Mustang");
            System.out.println("Model Name: " + myObj.modelName);
            System.out.println("Model Year: " + myObj.modelYear);

        }


    }
    
    /*
    recursion simplified
    10 + sum(9)
    10 + ( 9 + sum(8) )
    10 + ( 9 + ( 8 + sum(7) ) )
    10 + ( 9 + ( 8 + ( 7 + sum(6)) ) )
    10 + ( 9 + ( 8 + ( 7 + ( 6 + sum(5) ) ) ) )
    10 + ( 9 + ( 8 + ( 7 + ( 6 + ( 5 + sum(4) ) ) ) ) )
    10 + ( 9 + ( 8 + ( 7 + ( 6 + ( 5 + ( 4 + sum(3) ) ) ) ) ) )
    10 + ( 9 + ( 8 + ( 7 + ( 6 + ( 5 + ( 4 + ( 3 + sum(2) ) ) ) ) ) ) )
    10 + ( 9 + ( 8 + ( 7 + ( 6 + ( 5 + ( 4 + ( 3 + ( 2 + sum(1) ) ) ) ) ) ) ) )
    10 + ( 9 + ( 8 + ( 7 + ( 6 + ( 5 + ( 4 + ( 3 + ( 2 + ( 1 + sum(0) ) ) ) ) ) ) ) ) )
    10 + ( 9 + ( 8 + ( 7 + ( 6 + ( 5 + ( 4 + ( 3 + ( 2 + ( 1 + 0 ) ) ) ) ) ) ) ) )

    10 + sum(9)     // this line doesn't return yet, it just begets the next line
    10 +  9 + sum(8) 
    10 +  9 +  8 + sum(7) 
    10 +  9 +  8 +  7 + sum(6)
    10 +  9 +  8 +  7 +  6 + sum(5) 
    10 +  9 +  8 +  7 +  6 +  5 + sum(4) 
    10 +  9 +  8 +  7 +  6 +  5 +  4 + sum(3) 
    10 +  9 +  8 +  7 +  6 +  5 +  4 +  3 + sum(2)
    10 +  9 +  8 +  7 +  6 +  5 +  4 +  3 +  2 + sum(1)
    10 +  9 +  8 +  7 +  6 +  5 +  4 +  3 +  2 +  1 + sum(0)
    10 +  9 +  8 +  7 +  6 +  5 +  4 +  3 +  2 +  1 + 0 + sum(-1)
    10 +  9 +  8 +  7 +  6 +  5 +  4 +  3 +  2 +  1 + 0 + 0

    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 = 55
     */
    

