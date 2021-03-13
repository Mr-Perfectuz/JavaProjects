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

        //[Width]
        // minimum number of characters to be written as an output
//        System.out.printf(" Hello %10s", myString);


//         [precision]
        // sets number of digits of precision when outputting floating- point values.
//        System.out.printf(" You have this much money %.1f ", myDouble);

//        [flags]
//        adds an effect to output based on the flag added to format specifier
//        - : left-justifier
//        + : output a plus(+) or minus(-) sign for a numeric value
//        0 : numeric values are zero-padded
//        , : comma grouping separator if number > 1000

        System.out.printf(" You have this much money %,f ", myDouble);

//        System.out.printf( "%b", myBoolean);
//        System.out.printf("%c", myChar);
//        System.out.printf("%s", myString);
//        System.out.printf("%d", myInt);
//        System.out.printf("%f", myDouble);

    }
}
