public class DataTypes {
    public static void main (String[] args){
        //There are 8 primitive data types which are the building blocks for storing and manipulating data.
        //Primitive data types represent single values of a specific kind and have a fixed size in memory.

        // 1. byte - The byte data type is an 8-bit signed integer that can store values from -128 to 127
        byte myByte = -128;
        System.out.println( "My Byte value is:" + myByte);

        // 2. short - The Short data type is a 16-bit signed integer that can store vales from -32,768 and 32,767
        short myShort = -32768;
        System.out.println( "Short value is:" + myShort);

        // 3. int - The int data type is a 32-bit signed integer that can store values from -2,147,483,648 to 2,147,483,647
        int myInt = 2147483647;
        System.out.println( "My Integer value is:" + myInt);

        // 4. long - The long data type is a 64-bit signed integer that can store values from -9,223,372,036,775,808 to 9,223,372,036,775,807. Suffix L or l
        long myLong = -9223372036775808L;
        System.out.println( "My long value is:" + myLong);  

        // 5. float - The float data type is a 32-bit single-precision floating-point number that can store values up to approximately 7 decimal digits. Suffix F or f
        float myFloat = 3.1415F;
        System.out.println( "My Float value is:" + myFloat); 

        // 6. double -  - The double data type us a 64-bit large-precision floating-point number with approximately 16 decimal points. It is the default values in Java. Suffix D or d.
        double myDouble = 2.1234D;
        System.out.println( "My Double value is:" + myDouble); 

        // 7. character - A character represents single Unicode characters. A Unicode character is a 16-bit character set that replaces the 8-bit ASCII character set. Unicode allows the inclusion of symbols and specific characters from other languages. To use a character literal, enclose the character in a single quote delimiter.
        char myCharacter = 'A';
        System.out.println( "My Character value is:" + myCharacter);

        // 8. boolean - A boolean data type represent two state : true or false
        boolean myBoolean = true;
        System.out.println( "My Boolean value is:" + myBoolean);

        // Reference Data Types 
        // In addiction to primitive data types, Java also gas reference fata types, which are objecrs that store compex data structures or instances of classes.The main reference data type in Java are:

        // 1. Classes: A class is a blueprint or tenplate for creating objects. It defines the properties (fields) and behaviours (methods) that objects of that class will have. 

        // 2. Objects: An object is an instance of a class. It has its own unique set of values for the fields defined in the class, and it can access and execute the methods defined in the class.

        // 3. Arrays: An array is a data structure that can store a collection of values of the same data type. Arrays can be single-dimensional (a list) or muli-dimensional (a matrix or higher- dimensional structure).

        // 4. Strings: A String class represents a sequence of characters. Strings are imutable in Java, meaning their values cannot be changed after they are created.

        //5. Interfeces; An interface defines a contract or set of methods that a class must implement.It ides a way to achieve abstraction and mutiple inheritance in java.
        //Type casting is the process of converting a value from one data type to another. There are two types of type casting in Java:
        // 1. Impliciting casting (Automatic); This type of casting is performed automatically by the java compiler when it is safe and no data will be lost.It is possible to assign a value of a smaller data type to a larger data type variable, for example
        int x= 10;
        double y =x;
        System.out.println("Value of integer x:" + x);
        System.out.println("Value of double y" + y);
        //2. Explicit casting(Manual):This type of casting is required when you want to convert a value from larger data type to smaller data type or when a compiler cannot datermine the conversion automatically . Explicit casting is done by placing a target data type in parantheses before the value being cast, for example;
        double pi = 3.14159;
        int approximatePi = (int) pi;
        System.out.println("Initial value of Pi;" + pi);
        System.out.println("The New Value of PI" + approximatePi);

        //NB: Its important to note that explicit casting can lead to lead to data loss if the value being 
        //Variables Declaration and intialization 
        //In Java  variables are used to store data values. Before a variables can be used, it must be declared with a specific data type and an indentifer . 
        //Heres the syntax fer variable
        //dataType variablesName:
        // for example
        //After declaring a variable, you can assign a value to it using the assignment operator(-). This process is called intiallization:
        
        // you can also declare and initialize a variable in asingle statement;
        int score = 90;
        System.out.println("My score is:" + score);
        // The Scope of Variables
        // The Scope of a Variable refers to the region of the program where the variable is accessible.In java, there are three type of variables scope:
        // 1. Local Scope: Variables declared within a method, constuctor, or block(such as a loop or if statment) have local scope. The are only accessible within the block where they are defined and cannot be accessed outside that block;
        
        //2. Instance (object)scope; Variables declared at the class level, are called instance variables or fields. They belong to the instance of the class and are accessible throughout the class.
        //3.Static(Class)Scope; variables declared e=with the static keyword at the class level are called static variables or class variables. The belong to the class itself not to any instance of the class, and are shered among all instances of the class.
        //NB; Its important to note that local variables must be initialized before they can be used, while instance and static variables are automatically initialized with default values (0 for numeric types, false for booleans and null for object references).

        
    }
}