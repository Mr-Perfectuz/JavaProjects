import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args){
        ArrayList<String> food = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);


//        System.out.println("What do you order ?");

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");


        food.set(0, "Sushi");
        food.remove(2);
//        food.clear();

        for (int i=0; i<food.size(); i++){
            System.out.println("The list of food is "+ food.get(i));
        }
    }
}
