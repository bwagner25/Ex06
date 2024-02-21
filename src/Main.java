import java.util.Scanner;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
class intInput {
    Scanner scanner = new Scanner(System.in);
    public void promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = parseInt(userInput);
                isInt = true;
                System.out.println("Good job!");
                System.out.println("Your integer is: " + userInt);
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
        }
    }
}

class doubleInput {
    Scanner scanner = new Scanner(System.in);
    public void promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0.0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = parseDouble(userInput);
                isDouble = true;
                System.out.println("Good job!");
                System.out.println("Your double is: " + userDouble);
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = scanner.nextLine();
            }
        }
    }
}

class stringInput {
    Scanner scanner = new Scanner(System.in);

    public void promptString(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        boolean isString = false;
        while (!isString){
            try {
                parseDouble(userInput);
                System.out.println(userInput + " is not a valid string. " + message);
                userInput = scanner.nextLine();
            } catch (NumberFormatException e){
                isString = true;
                System.out.println("Good job!");
                System.out.println("Your string is: " + userInput);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        intInput intInput = new intInput();
        intInput.promptInt("Enter an integer.");

        doubleInput doubleInput = new doubleInput();
        doubleInput.promptDouble("Enter a double.");

        stringInput stringInput = new stringInput();
        stringInput.promptString("Enter a string.");
    }
}