import java.util.Scanner;

public class forLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name1, name2, name3;
        System.out.println("Enter the name1");
        name1 =  scanner.next();

        System.out.println("Enter the name2");
        name2 =  scanner.next();

        System.out.println("Enter the name3");
        name3 =  scanner.next();

        for (int i=0; i<=3; i++){

            System.out.println(i);
        }
        System.out.println("Hello " + name1);
        System.out.println("Hello " + name2);
        System.out.println("Hello " + name3);

    }
}
