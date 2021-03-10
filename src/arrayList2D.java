import java.util.*;

public class arrayList2D {
    public static void main(String[] args){

        ArrayList<ArrayList<String>> GrocceryList = new ArrayList<>();

        ArrayList<String> bakeryLIst = new ArrayList<String>();
        bakeryLIst.add("Pasta");
        bakeryLIst.add("Garlic Bread");
        bakeryLIst.add("Donuts");

        ArrayList<String> ProduceLIst = new ArrayList<String>();
        ProduceLIst.add("tometos");
        ProduceLIst.add("zukinich");
        ProduceLIst.add("Pappers");

        ArrayList<String> DrinksLIst = new ArrayList<String>();
        DrinksLIst.add("Cola");
        DrinksLIst.add("Coffe");

        GrocceryList.add(bakeryLIst);
        GrocceryList.add(ProduceLIst);
        GrocceryList.add(DrinksLIst);

        System.out.println(GrocceryList.get(2).get(1));
    }
}
