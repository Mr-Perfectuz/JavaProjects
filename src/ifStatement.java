import java.util.Scanner;
public class ifStatement {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        int age, id;
        String password;
        System.out.println("How old are you ?" );
        age = scanner.nextInt();

        System.out.println("Enter your id " );
        id = scanner.nextInt();

        System.out.println("Enter your password");
        password = scanner.next();

        if (id == 12345 || password == "Nothing"){
            System.out.println("You have already registered");
        }
        if (age >= 18){
            System.out.println(" You can apply to our University !");
        } else {
            System.out.println("Sorry, You are not eligible to apply");
        }


    }
}
