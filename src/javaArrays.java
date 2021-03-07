public class javaArrays {
    public static void main(String[] args){
//        String[] cars = {"Ferrari","Tesla","BMW"};
        int[] numbers = {1, 3, 4};
        String[] cars = new String[4];

        cars[0] = "Ferrari";
        cars[1] = "Porsce";
        cars[2] = "Tesla";
        cars[3] = "Gm";


        for (int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

    }
}
