public class TrafficLightSimulator {

    public static void main(String[] args) {
        for (int minute = 0; minute < 1440; minute++) {
            int hour = minute / 60;
            int minuteOfHour = minute % 60;

            System.out.printf("Time: %02d:%02d\n", hour, minuteOfHour);
            
            // Check if an emergency vehicle is detected
            if (isEmergencyVehicleDetected()) {
                System.out.println("Emergency vehicle detected! Changing lights.");
                simulateTrafficLight(10, 3, 0); // Green for 10 seconds, no red light
            } else {
                String trafficCondition = determineTrafficCondition(hour);
                
                int greenDuration = setGreenLightDuration(trafficCondition);
                int yellowDuration = 3;
                int redDuration = setRedLightDuration(trafficCondition);
                
                simulateTrafficLight(greenDuration, yellowDuration, redDuration);
            }
            
            System.out.println("=================================");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to determine the traffic condition based on the hour
    public static String determineTrafficCondition(int hour) {
        if (hour >= 7 && hour < 10) {
            return "Morning Rush Hour";
        } else if (hour >= 16 && hour < 19) {
            return "Evening Rush Hour";
        } else if (hour >= 23 || hour < 5) {
            return "Night";
        } else {
            return "Normal";
        }
    }

    // Method to set the green light duration based on traffic condition
    public static int setGreenLightDuration(String trafficCondition) {
        switch (trafficCondition) {
            case "Morning Rush Hour":
            case "Evening Rush Hour":
                return 60; // 60 seconds during rush hours
            case "Night":
                return 30; // 30 seconds at night
            default:
                return 45; // 45 seconds during normal conditions
        }
    }

    // Method to set the red light duration based on traffic condition
    public static int setRedLightDuration(String trafficCondition) {
        if (trafficCondition.equals("Night")) {
            return 60; // 60 seconds at night
        } else {
            return 45; // 45 seconds during other conditions
        }
    }

    // Method to simulate the traffic light behavior
    public static void simulateTrafficLight(int greenDuration, int yellowDuration, int redDuration) {
        System.out.println("Green light for " + greenDuration + " seconds");
        System.out.println("Yellow light for " + yellowDuration + " seconds");
        if (redDuration > 0) {
            System.out.println("Red light for " + redDuration + " seconds");
        }
    }

    // Method to simulate emergency vehicle detection
    public static boolean isEmergencyVehicleDetected() {
        // Simulate the detection of an emergency vehicle (for demonstration purposes)
        // In a real-world scenario, this could interface with sensors or other input.
        return Math.random() < 0.1; // 10% chance of detecting an emergency vehicle
    }
}

/*
Traffic Light Simulator Assignment (Assignment 2)

Objective:
Analyze and explain the TrafficLightSimulator program, focusing on the control structures used and their role in solving a real-world problem.

Questions:

1. Program Overview:
    a) Describe the overall purpose of this program.
    The purpose of the TrafficLightSimulator program is to simulate the operation of traffic lights over a 24-hour period, adjusting the duration of green, yellow, and red lights based on the time of day and traffic conditions. It aims to provide an understanding of how traffic light systems adapt to varying traffic patterns, such as rush hours and nighttime.


    b) Explain how this program simulates a 24-hour period. What control structure is used for this, and why is it appropriate?
    The program simulates a 24-hour period using a for loop that iterates from 0 to 1439, representing each minute of the day (1440 minutes in total). This control structure is appropriate because it allows for a straightforward iteration through each minute, making it easy to manage time-based events.

    

2. Time and Traffic Condition Handling:
    a) How does the program convert the simulation time to hours and minutes? Explain the mathematical operations used.
    The program converts the simulation time to hours and minutes using integer division and the modulus operator. The hour is calculated using minute / 60, which gives the number of complete hours in the total minutes. The minute of the hour is calculated using minute % 60, which gives the remainder of minutes after full hours.


    b) Describe the control structure used in the determineTrafficCondition method. Why is this structure suitable for this task?
    The determineTrafficCondition method uses a series of if-else statements to evaluate the current hour and return the corresponding traffic condition. This structure is suitable because it allows for clear and straightforward conditions to be checked in a sequential manner, making it easy to understand which traffic condition applies based on the hour.



3. Light Duration Setting:
    a) Explain the control structure used in the setGreenLightDuration method. What are the advantages of using this structure?

    The setGreenLightDuration method uses a switch statement to determine the duration of the green light based on the traffic condition. The advantages of using a switch statement include improved readability and maintainability, especially when dealing with multiple conditions, as it clearly separates each case.

    b) Compare and contrast the control structures used in setGreenLightDuration and setRedLightDuration. Why might different structures have been chosen for these similar tasks?
    The setGreenLightDuration method uses a switch statement, while setRedLightDuration uses an if statement. The switch is more appropriate for setGreenLightDuration because it handles multiple specific cases (different traffic conditions) efficiently. In contrast, setRedLightDuration only has two conditions (Night vs. Non-Night), making an if statement simpler and more straightforward for this limited choice.


4. Main Simulation Loop:
    a) Identify and explain all the control structures used within the main method.
    For Loop: Iterates through each minute of the day (0-1439).
    Try-Catch Block: Handles potential interruptions during the sleep period, ensuring that the program can manage exceptions gracefully.

    b) How does the program create a delay between each "minute" of the simulation? Why is exception handling used here?

    The program creates a delay using Thread.sleep(50), which pauses the execution for 50 milliseconds. Exception handling is used to catch InterruptedException, which might occur if the thread is interrupted during sleep, allowing the program to respond appropriately without crashing.



5. Code Organization:
    a) How does the use of methods (like determineTrafficCondition, setGreenLightDuration, etc.) contribute to the organization and readability of the code?

    The use of methods encapsulates specific functionalities, making the code modular and easier to read. Each method has a single responsibility, which enhances maintainability and allows for easier testing and debugging.


    b) Suggest one way the code could be further organized or improved using object-oriented programming concepts.

    One way to improve the code using object-oriented programming is to create a TrafficLight class that encapsulates the properties and behaviors of a traffic light, such as green, yellow, and red durations. This would allow for better organization and the potential for more complex interactions, such as handling pedestrian crossings or emergency vehicle prioritization.



6. Real-world Application:
    a) How does this program reflect real-world traffic light operations? Provide examples of how it simulates actual traffic management.

    The program simulates real-world traffic light operations by adjusting light durations based on time-of-day traffic patterns, such as longer green lights during rush hours and shorter durations at night. This reflects how traffic management systems adapt to varying conditions to optimize traffic flow.

    b) What limitations does this simulation have compared to a real traffic light system? Suggest one additional feature that could make it more realistic.

    One limitation is the lack of responsiveness to real-time traffic conditions, such as accidents or unexpected pedestrian crossings. An additional feature
    that could make it more realistic is the ability to simulate traffic flow based on real-world data,

7. Control Structures Overview:
    a) List all the control structures used in this program and briefly explain the purpose of each in the context of the traffic light simulation.

    1.  For Loop: Iterates through each minute of the day.


    Purpose: The for loop iterates through each minute of the day (0 to 1439), simulating a 24-hour period. It allows the program to execute the traffic light simulation for every minute, adjusting light durations based on the time of day.
    
    2. If-Else Statements:

    Purpose: Used in the determineTrafficCondition method to evaluate the current hour and determine the traffic condition (e.g., "Morning Rush Hour", "Night"). This structure allows for sequential checks of conditions to find the applicable traffic situation.

    3.  Switch Statement:


    Purpose: Used in the setGreenLightDuration method to determine the duration of the green light based on the traffic condition. It provides a clear and organized way to handle multiple specific cases.

    4.   Try-Catch Block:


    Purpose: Used to handle potential InterruptedException during the Thread.sleep(50) call. This ensures that the program can gracefully manage interruptions without crashing.


    b) For each control structure you listed, explain why it was chosen over other potential options.

    1.   For Loop: The for loop was chosen because it allows for a straightforward and efficient iteration through each  minute of the day. It is well-suited for this task due to its simplicity and readability.


    Reason for Choice: The for loop is ideal for iterating a known number of times (1440 minutes). It is concise and clearly conveys the intent of simulating each minute of a day.

    2.    If-Else Statements: If-else statements were chosen because they provide a clear and structured way  to evaluate multiple conditions and determine the appropriate traffic condition. This structure is well-suited for this task  due to its readability and ease of maintenance. 


    Reason for Choice: The if-else structure is suitable for evaluating conditions that are not mutually exclusive but rather sequential. It allows for clear logical flow and easy comprehension of which traffic condition applies at a given hour.

    3.    Switch Statement: The switch statement was chosen because it provides a clear and concise way to handle multiple  specific cases (traffic conditions) and determine the corresponding green light duration. This structure is well-suited  for this task due to its readability and efficiency.  

    Reason for Choice: The switch statement is more readable and maintainable than multiple if-else statements when dealing with multiple discrete conditions. It clearly separates cases for different traffic conditions, making it easier to modify in the future.

    4.     Try-Catch Block: The try-catch block was chosen because it allows for graceful handling of  potential InterruptedException during the Thread.sleep(50) call. This ensures that the program can manage interruptions without  crashing.  

    Reason for Choice: The try-catch block is necessary for handling exceptions that may arise from thread sleep interruptions. It allows the program to maintain stability by managing potential errors gracefully.

8. Code Modification:
    Propose and explain in detail how you would implement one of the following changes to the program, focusing on which control structures you would use and why:
    - Allow user input to manually change traffic conditions.
    - Implement a system to handle emergency vehicle priority.
    - Add a pedestrian crossing feature that interrupts the normal light cycle.

Submission Instructions:
- Provide detailed explanations for each question.
- Include code snippets where relevant to support your explanations.
- Your answers should demonstrate a clear understanding of Java control structures and their application in solving real-world problems.
*/