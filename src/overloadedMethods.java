public class overloadedMethods {
    public static void main(String[] args){

//        overloadedMethods = methods that share the same name but they have different parameters
//                            method name + parameters = method signature

//        int x = add(2, 4, 6, 8);
        double x = add(2.2, 4.4, 6.6, 8.8);
        System.out.println(x);
    }
    static int add(int a, int b){
        System.out.println("This is overloaded method number #1");
        return a+b;

    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded method number #2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int e){
        System.out.println("This is overloaded method number #3");
        return a+b+c+e;
    }
    static double add(double a, double b){
        System.out.println("This is overloaded method number #4");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overloaded method number #5");
        return a+b+c;
    }
    static double add(double a, double b, double c, double e){
        System.out.println("This is overloaded method number #6");
        return a+b+c+e;
    }

}
