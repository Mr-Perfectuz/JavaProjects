import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args){
        // nested loops = a loop inside of a loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++) {
            System.out.println();
            for(int j=1; j<=columns;j++) {
                System.out.print(symbol);
            }
        }
//        Scanner scanner = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol = "";
//
//        System.out.println("Enter the number of rows: ");
//        rows = scanner.nextInt();
//        System.out.println("Enter the number of columns: ");
//        columns = scanner.nextInt();
//        System.out.println("Enter symbol to use: ");
//        symbol = scanner.next();
//
//        for (int i=1; i<=rows; i++){
//            System.out.println();
//            for (int j=1; i<=columns; j++){
//                System.out.print(symbol);
//            }
//        }
    }
}
