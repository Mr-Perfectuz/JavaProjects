import java.util.ArrayList;

public class forEachLoop {
    public  static  void main(String[] args){
//        String[] animals = {"cat","dog","cow","horse"};

//        ArrayList<String> animals = new ArrayList<>();
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("cow");
//        animals.add("horse");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        for (Integer i: numbers){
            System.out.println(i);

        }

    }
}
