import java.util.Scanner;

public class javaMethods {
    public static void main(String[] args){

//        method  is a block of code that is executed when it is called upon
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = scanner.nextLine();

        hello(name);
    }

   static void hello(String name){
        System.out.println("Hello "+ name);
    }
}
