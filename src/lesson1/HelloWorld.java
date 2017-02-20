package lesson1; 
// Remove the above line if it errors i.e. you didn't put this in a package

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Java");
        System.out.println();
        System.out.print("Hello");
        System.out.println(" World!");

        // Single line comment
        /*
         * Multi-line comment
         * Hi!
         */

        /* 
         * int and double are data types
         * x and y are variable names
         * 1 and 1.3 are literals
         * The following are declaration and initialization statements
         * <type> <name> = <literal>;
         * <type> <name> = <expression;
         * The following is a declaration statement
         * <type> <name>;
         * This is an initialization statement only the first time
         * <name> = <literal or expression>;
         * Otherwise its an assignment statement
         */

        int x = 1;
        double y = 1.3;

        // This gives 2.3
        double z = x + y;

        // This is an error because it 2.3 is not an int
        // int error = x + y; 
        
        // This gives 2 via casting i.e. making 2.3 an int
        int fine  = (int)(x + y);
        
        System.out.println(x);
        System.out.println(y);

        String s = "Hi there";
        System.out.println(s);

        // Generates a number between 0.0 inclusive and 1.0 exclusive
        double rand = Math.random();
        // Create a number between 0-9
        int randInt = (int)(rand*10);

        // Gets the absolute value of a number
        int absInt = Math.abs(-1);

        // Gets the square root of a number
        double sqrt = Math.sqrt(20);

        // Look at the Math API for more methods
    }
}
