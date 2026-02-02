import java.util.Scanner;


public class App {

    public static  int add(int a, int b) {
            return a + b;
        }

    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the first number you wish to add: ");
        int num1 = keyboard.nextInt();
        System.out.println("Enter the second number you wish to add: ");
        int num2 = keyboard.nextInt();

        int sum = add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}