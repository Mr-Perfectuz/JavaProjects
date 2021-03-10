import java.util.ArrayList;

public class forEachLoop {
    public  static  void main(String[] args){
//        String[] animals = {"cat","dog","cow","horse"};

        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("cow");
        animals.add("horse");

        for (String i: animals){
            System.out.println(i);

        }

    }
}
