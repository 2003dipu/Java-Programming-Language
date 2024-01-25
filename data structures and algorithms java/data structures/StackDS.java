import java.util.Stack;

public class StackDS {

    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();

        System.out.println();

        //System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("Skyria");
        stack.push("DOOM");
        stack.push("Border Lands");
        stack.push("FFVII");

        //System.out.println(stack.empty());
        //stack.pop();
        //stack.pop();
        //stack.pop();
        //String myFavGame= stack.pop();
        

        //System.out.println(stack);
        //System.out.println(myFavGame);
        //System.out.println(stack.peek());

        //int search = stack.search("Minecraft");

        //System.out.println(search);

        //System.out.println(stack.search("FFVII"));

        for (int i = 0; i < 100; i++) {
            stack.push("Fallout76");
            
        }

        System.out.println(stack);


        System.out.println();
    }
}

/*
stack = LIFO data structure. Last in, first out
 */