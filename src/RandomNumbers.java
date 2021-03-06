import java.util.Random;
import java.util.Scanner;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();


//        for(int i = 0; i < a.length; i++){
//            for(int j = 0; j < a[i].length; j++){
//                a[i][j] = r.nextInt();
//            }
//
//        }
//        if (x>10 || x<=20){
//            System.out.println(random.nextInt(10)+1);
//        }
//        Random r = new Random();
//        int low = 10;
//        int high = 100;
//        int result = r.nextInt(high-low) + low;
//        System.out.println(result);
        int firstNumber;
        int lastNumber;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the starting random number");
        firstNumber = scanner.nextInt();

        System.out.println("Give me the last random number");
        lastNumber = scanner.nextInt();

        result = random.nextInt(lastNumber - firstNumber)+firstNumber;
        System.out.println("The number between "+ firstNumber +" and "+ lastNumber+" is "+ result);

    }
}
