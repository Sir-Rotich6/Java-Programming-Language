public class ControlFlowStructures {
    
    public static void main(String[] args){

        //Control Flow statements
        //In programmming, control flor statements are used to control the order of execution statements based on certain conditions or loops. Java provides several control flow statements to facilitate this:

        // Decision Statements
        // Decision statements are used to make decisions based on conditions. They help in controlling the flow of execution depending on whether a certaion condition  is true or false.
        // The most common decision statements in java are: if, if-else, if-else-if(ladder) and switch statements.

        // 1. if statement
        // The if statement executes a block of code if the specified condition evaluates to true.
        // Snytax
        // if(Condition) {
            //Code to execute if condition is true.
        // }

        int age = 18;
        if (age >=18){
            System.out.println("You are eligible to");
        }

        // 2. if-else statement
        // The if-else statement allows you to execute one block of code if the condition is true and another block if the condition is false.
        // Syntax
        // if(condition) {
            //Code to execute if condition is true
        //}
        // else {
            //Code to execute if condition is false
        //}

        if (age>= 18){
            System.err.println("You are eligible to");
        }else{
            System.err.println("You are not eligible to");
        }

        // 3. if-esle-if(ladder)
        // it is used when you have multiple conditions to evaluate. It checks conditons one by one, and the first condition that evaluates to true will have its corresponding block of code executes.

        // Syntax
        // if(condition1){
            // Code to execute if condition1 is true
        //} else if (condition2) {
            // Code to execute if condition is  false but condition1 is true.
        //} else if (condition3) {
            // Code to execute if condition1 and condition2 are false but condition3 is true.
        //} else {
            // Code to execute if all condition are false
        //}

        int score = 85;
        if(score >=90){
            System.out.println("Grade - A");
        } else if(score >=80){
            System.out.println("Grade - B");
        } else if(score >=70){
            System.out.println("Grade - C");
        } else {
            System.out.println("Grade - D");
        }
        // 4. Switch Statement.
        // It is an alternative of is-esle-if when you are checking a single variable against multiple values. It evaluates the expression and executes the matching case block.
        
        //Syntax
        // switch (expression){
            // case value1:
                // code to execute if expression equals value1
                // break;
            // case value2:
                // code to execute if expression equals value2
                // break;
            // More cases ...
            // default:
                // code to execute if no cases match
        //}
    
        int DayOfTheWeek = 1;

        switch (DayOfTheWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Satuday");
                break;
            default:
                System.out.println("Invalid Day!!!");
            
        }

        // sc.close();

        String favColor = "Blue";

        switch (favColor) {
            case "Red":
                System.out.println("your fav color is Red");
                break;
            case "Green":
                System.out.println("your fav color is Green");
                break;
            case "Blue":
                System.out.println("your fav color is Blue");
                break;
            case "Yellow":
                System.out.println("your fav color is Yellow");
                break;
            case "White":
                System.out.println("your fav color is White");
                break;
            default:
                System.out.println("We don't know your fav color");
        }

        // Challenge time, hurray!!


        //Write a java Program to check if a number is positive, negative or zero using if-else statement, e.g -5 -> The number is negative.
        int num = -5;
        if (num>= -5){
            System.err.println("Number is negative");
        }else{
            System.err.println("Number is positive");
        }
    }
}
