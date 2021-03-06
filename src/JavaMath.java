import java.util.Scanner;
public class JavaMath {
    public static void main(String[] args){
//        double x= 3.14;
//        double y = -9;
//        y = Math.abs(y);
////        double z= 10;
//        double w = 6.09;
//        double z = (Math.max(x, y));
//        System.out.println(Math.max(w, z));   // maximum value
//        System.out.println(Math.abs(y));  //absolute value
//        System.out.println(Math.sqrt(y));  //square root
//        System.out.println(Math.round(x));  //round down
//        System.out.println(Math.floor(x));  //round down in a double
//        System.out.println(Math.ceil(x));  //ceil up


        // Let's find out the hypotenuse of a triangle
        System.out.println("=====================================================");
        double side1;
        double side2;
        double hypotenuse;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the one side of a triangle");
        side1 = scanner.nextDouble();

        System.out.println("Enter the another side of a triangle");
        side2 = scanner.nextDouble();

        hypotenuse = Math.sqrt(side1*side1 + side2*side2);
        System.out.println("The hypotenuse of a square is "+ hypotenuse);

        scanner.close();

    }
}
