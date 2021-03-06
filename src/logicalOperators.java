import java.util.Scanner;
public class logicalOperators {
    public static void main(String[] args){

//        && => (AND) both conditions must be true
//        || => (OR) either condition must be true
//        ! (NOT) reverses boolean value of a condition

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name =scanner.next();

        if (name.equals("Jack") || (name.equals("John"))){
            System.out.println("You are in the friend's list");
        }
//        else if (!name.equals("Tony") && (!name.equals("Robert"))){
//            System.out.println("You are not in the black list");
//         }
        else {
            System.out.println("You can attend the seminar");
        }
    }
}
