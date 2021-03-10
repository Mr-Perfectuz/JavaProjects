import java.util.Scanner;

public class javaMethods {
    public static void main(String[] args){

//        method  is a block of code that is executed when it is called upon
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Enter number one: ");
        num1 = scanner.nextInt();

        System.out.println("Enter number two: ");
        num2 = scanner.nextInt();


        System.out.println("What is your name ? ");
        String name = scanner.next();

        System.out.println("What is your age ? ");
        int age = scanner.nextInt();

        hello(name, age);
        int z = sum(num1, num2);
        System.out.println("The sum of "+ num1 +" and "+ num2+" is "+ z);
    }

   static void hello(String name, int age){
        System.out.println("Hello "+ name+", I am "+age+" years old");
    }

    static int sum(int num1, int num2){
        int add = num1 + num2;
        return add;
    }
}
