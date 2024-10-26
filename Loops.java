public class Loops {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args, String string) {
        //Bounded and unbounded Loops (btw)

        // 1. for loop
        // The for loop is used when you know in advance how many times you want to execute a statement or block of statements.

        // Syntax
        // for(intialization; condition; update){
            // Code to be executed
        //} 

        // where;
        //Initialization - This happens only once, and it's usually used to initialize the loop continues - otherwise, it stops.
        // update - updates the loop counter at the end of the iteration. 

        for (int x = 1; x <= 10; x++){
            System.out.println(x);
        }

        System.out.println
        ("===========================================");

        // Expected Output: 60 45 30 15 0 -15 -30 -45 -60
        for (int i = 60; i >= -60; i -= 15){
            System.out.println(i);
        }

        System.out.println
        ("===========================================");

        //Expected output: -2 0 2 4 6 8 10 12 14 16 18(-negatives)
        for (int i = -2; i >= -18; i -= 2){
            System.out.println(i);
        }

        System.out.println
        ("===========================================");

        //While loop
        // The while loop is used to execute a block of code repeatedly as long as a given condition is true. It is often used when you don't know the exact number of interations beforehand.

        // Syntax
        // while(condition{
            //Code to execute 
        //})

        // Example :Output integers 1 2 3 4 5
        int y = 1;
        while(y >=5){
            System.out.println(y);
            y++;
        }

        System.out.println
        ("===========================================");

        //Expected Output: 50 45 40 35 30 25 20 15 10 5 0 

        int z = 50;
        while (z>= 0);
            System.out.println(z + "");
            z-=5;

        
            System.out.println
            ("===========================================");

            int a = 0;

            while (a <= 23) {
                System.out.print(a + string);
                a ++;
            }

                        //syntax
            //do{
            //code to execute (execute at least once)
            //}while(condition);
            int number =10;
            do {
            System.out.println(number);
            System.out.println("Java is Cool");
            number++;
            }while (number <= 15);
            System.out.println
            ("=====================");
            //Using a do-while loop, output "Java is Cool"ten times.
            
            int n =1;
            do{
                System.out.println("Java is Cool");
                n++;
            }while (n<=10);
    }
}

