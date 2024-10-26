public class OperatorsAndExpressions {
    public static void main(String[] args) {
        //1. Arithmetic Operators
        //Java provides several arithmetic operators to perform mathematical operators on numerical values.
        //These operators are:
        int x = 20;
        int y = 6;

        // 1. Addition(+): Adds two values.
        int sum = x + y;
        System.out.println("The sum is:" + sum);

        // 2. Subtraction(-): Subtracts the second value from the first value.
        int difference = x - y;
        System.out.println("The difference is:" + difference);

        // 3. Multiplication(*): Multiplies two values.
        int product = x * y;
        System.out.println("The product is:" + product);
        // 4. Bivision(/): Divides the first value by the second value.
        int quotient = x / y;
        System.out.println("The quotient is:" + quotient);

        // 5. Modulus(%): Returns the remainder after dividing the first value by the second value.
        int modulo = x % y;
        System.out.println("The modulo is:" + modulo);

        //2. Relational Operators.

        // Lets consider x and y - 20 and 6 respectively:

        // Relational operators are used to compare two vales and return a boolean result (true or false).
        // The relational operators in java are:

        // 1. Equal to (==): Checks if the two values are equal.
        boolean isEqual = (x == y);
        System.out.println("20 equal to 6?" + isEqual);

        // 2. Not equal to (!=): Checks if the two values are nor equal.
        boolean noteEqualTo = (x != y);
        System.out.println("20 equal to 6?" + noteEqualTo);
        // 3. Greater than(>): Checks if the first value is greater than the second value.
        boolean greaterThan = (x > y);
        System.out.println("20 equal to 6?" + greaterThan);
        // 4. Less than(<): Checks if the first value is less than the second value.
        boolean lessThan = (x < y);
        System.out.println("20 equal to 6?" + lessThan);
        // 5. Greater than or equal to (>=): Checks if the first value is greater than or equal to the second value.
        boolean greaterThanOrEqualTo = (x >= y);
        System.out.println("20 equal to 6?" + greaterThanOrEqualTo);
        // 6. Less than or equal to (<=): Checks if the first value is less than or equal to the second value.
        boolean lessThanOrEqualTo = (x <= y);
        System.out.println("20 equal to 6?" + lessThanOrEqualTo);

        // 3. Logical Operators.
        // Logical operators are used to combine or negate boolean expressions.
        // The logical operators in java are:
        boolean a = true;
        boolean b = false;
        // 1. Logical AND (&&): Returns true if both operands are true, otherwise false.
        boolean andResult = a && b; // returns False
        System.out.println("true AND false is?" + andResult);

        // 2. Logical OR (||): Retursn true if at least one operand are true, otherwise false.
        boolean orResult = a || b;
        System.out.println("true AND false is?" + orResult); // returns True.
        // 3. Logical NOT (!): Negates the boolean value of the operand. (returns true if the operand is false, and false if the operand is true).
        boolean notResult = !a;
        System.out.println("Not True is?" + notResult); // returns False.

        // 4. Assignment Operators.
        // Assignment opeerators are used to assign values to variables. The basic assignment operators in java is equal sign(=).
        // Additionally, Java provides compound assignment operators that combine an arithmetic or bitwise operation with an assignment.

        // lets consider 10

        // 1. Simple assignment(=): Assigns the value of the right operand to the left operand
        int z = 10;

        // 2. Addition assignment(+=): Adds the value of the right operand th the left operand and assigns the result to the lsft operand.
        z += 5;
        System.out.println(z); // returns 15
        // 3. Subtraction assignment(-=): Subtracts the value of the right operand  from the value of the left operand and assigns the results to the left operand.
        z -= 3;
        System.out.println(z); // returns 12

        // 4. Multiplication assignmet(*=): Multiplies the left operand by the right operand and assigns the results to the left operand.
        z *= 2;
        System.out.println(z); // returns 24
        // 5. Division Assignment(/=): Divides the left operand by the right operand and assigns the results to the left operand.
        z /= 4;
        System.out.println(z); // returns 6

        // 6. Modulus Assignment(%=): Calculates the modulus of the left operand divided by the right operand and assigns the results to the left operand.
        z %= 3;
        System.out.println(z); // returns 0


        // Exercise 3.1: Write a java program that checks if a given number is even or odd using the modulus operant %.
        

        int number = 5;

        // Ternary operant
        // Syntax
        // Expression1 ? expression2 : expression3;
        // Where: expression1 is a boolean expression been evaluated. Expression2 will be returned if exprssion1 evaluates to true and expression3 will be returned if expression1 evaluates to false.

        String result = (number % 2 == 0)? "The number is even": "The number is odd";
        System.out.println(result);


        // Next -> Conditional Structures 
    }
}
