public class wrapperClasses {
    public static void main(String[] args){
        boolean a = true;
        Character b = '@';
        Integer c = 123;
        double d = 3.14;
        String e = "Bro";
        System.out.println(factorial(5));
    }

    public static int factorial(int number){
        if (number ==1){
            return 1;
        }
        else {
            return number * factorial(number-1);
        }
    }
}
