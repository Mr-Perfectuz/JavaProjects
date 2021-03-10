import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        for (int i=0; i<=number; i++){
            factorial = factorial * number;
        }
        System.out.println("Factorial of "+ number + " is "+ factorial);
    }
}

