import java.util.Scanner;

public class whileLoop {
    public static void main(String [] args){
//        int score = 10;
//        while (score ==10){
//            System.out.println("The score is "+ score);
//        }
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()){
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }

        System.out.println("Glad to see you  "+ name.toUpperCase());
    }
}
