import java.util.Scanner;

public class calculateRadius {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the Radius of the circle: ");
        int radius = scanner.nextInt();

        double area = radius * radius * 3.14;

        System.out.println(" The area of the circle if "+ area);

    }
}
