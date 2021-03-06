import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.println("Enter today's day ! ");
        day = scanner.next();

        switch (day){
            case "Monday": System.out.println("You need to work");
            break;

            case "Tuesday": System.out.println("You need to clean the home");
            break;

            case "Thursday": System.out.println("You need to take the children from school");
            break;

            case "Wednesday": System.out.println("You have a meeting tonight");
            break;

            case "Friday": System.out.println("You have to visit your parents");
            break;

            case "Saturday": System.out.println("You have to organize a party");
            break;

            case "Sunday": System.out.println("You are free to do whatever you want");
            break;
            default:
                System.out.println("You have no plans for today");



        }


    }
}
