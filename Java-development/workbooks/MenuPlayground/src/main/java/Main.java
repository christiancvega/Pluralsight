import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int mainMenuCommand;

        do {
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Divison");
            System.out.println("0) Exit");

            System.out.print("Choose an option: ");
            mainMenuCommand = scanner.nextInt();

            System.out.println("You Chose: " + mainMenuCommand);

            switch(mainMenuCommand){
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command not found! Please try again");
            }
        } while(mainMenuCommand != 0);
    }
    public static void add(){
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
    }
    public static void sub(){
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 - num2);
    }
    public static void multiply(){
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 * num2);
    }
    public static void divide(){
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 / num2);
    }
}
