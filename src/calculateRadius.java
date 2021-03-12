import java.math.*;
import java.util.Date;
import java.util.Scanner;

public class calculateRadius {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

//        Date date=java.util.Calendar.getInstance().getTime();
//        System.out.println(date);


        long totalMillisecond = System.currentTimeMillis();
        long totalSeconds = totalMillisecond  / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds  / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        long GMT = currentHours + 5;
        long GMT1 = currentHours + 9;



        System.out.println("Current time is "+ currentHours+ " hour "+ currentMinutes+ " minutes "+ currentSeconds+" seconds");
        System.out.println("Current time(GMT + 9): "+ GMT1 + ":" + currentMinutes+ ":"+ currentSeconds);
        System.out.println("Current time(GMT + 5): "+ GMT+ ":" + currentMinutes+ ":"+ currentSeconds);















//     double f= 100;
//     double c = (f-32) / 1.8;
//        System.out.println(c);

//        double Fahrenheit;
//
//        System.out.println(" Enter a degree in Fahrenheit: ");
//        Fahrenheit = scanner.nextDouble();
//
//        double Celsius =  (Fahrenheit - 32) *5/9 ;
//
//
//        System.out.println("Fahrenheit "+ Fahrenheit+ " is "+ Celsius+ " in Celsius ");









//     int num1, num2;
//
//        System.out.println("Enter the first number: ");
//        num1 = scanner.nextInt();
//
//        System.out.println("Enter the second number: ");
//        num2= scanner.nextInt();
//
//        int add = num1 + num2;
//        int substract = num1 - num2;
//        int multiple = num1 * num2;
//        int quotient = num1 / num2;
//
//        int reminder = 5%6;
//
//        System.out.println(num1 + " + "+ num2+ " = "+ add);
//        System.out.println(num1 + " - "+ num2+ " = "+ substract);
//        System.out.println(num1 + " * "+ num2+ " = "+ multiple);
//        System.out.println(num1 + " / "+ num2+ " = "+" the quotient is "+ quotient+ " with a reminder of "+ reminder);
//


//        System.out.println("Enter the first number: ");
//        num1 = scanner.nextDouble();
//
//        System.out.println("Enter the second  number: ");
//        num2 = scanner.nextDouble();
//
//        System.out.println("Enter the third number: ");
//        num3 = scanner.nextDouble();
//
//        double averageNumber = (num1 + num2 + num3) /3;
//        System.out.println(" The average of " + num1 + " "+ num2 +" and "+ num3+ " is "+ averageNumber);

    }
}
