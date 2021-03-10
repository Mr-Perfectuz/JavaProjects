import java.util.Scanner;

public class javaMethods {
    public static void main(String[] args){

//        method  is a block of code that is executed when it is called upon
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = scanner.nextLine();


        System.out.println("What is your age ? ");
        int age = scanner.nextInt();

        hello(name, age);
    }

   static void hello(String name, int age){
        System.out.println("Hello "+ name+", I am "+age+" years old");
    }
}
