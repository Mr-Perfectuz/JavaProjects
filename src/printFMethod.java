public class printFMethod {
    public static void main(String[] args){
        // printf= an optional method to control, format, and display text to the console window
        // two arguments = format string + (object/variable/value)

//        System.out.printf(" This is %d a message ", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Joe";
        int myInt = 50;
        double myDouble = 1000;

//        System.out.printf( "%b", myBoolean);
//        System.out.printf("%c", myChar);
//        System.out.printf("%s", myString);
//        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

    }
}
