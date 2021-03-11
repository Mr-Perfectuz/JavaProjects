
import java.util.Scanner;

public class calculateRadius {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     double num1, num2, num3;

        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter the second  number: ");
        num2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        num3 = scanner.nextDouble();

        double averageNumber = (num1 + num2 + num3) /3;
        System.out.println(" The average of " + num1 + " "+ num2 +" and "+ num3+ " is "+ averageNumber);

    }
}
