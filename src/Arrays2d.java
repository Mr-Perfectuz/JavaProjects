public class Arrays2d {
    public static void main(String [] args){
        String[][] names = new String[3][3];
        names[0][0] = "Row1";
        names[0][1] ="Row2";
        names[0][2] ="Row3";
        names[1][0] ="Row4";
        names[1][1] ="Row5";
        names[1][2] ="Row6";
        names[2][0] ="Row7";
        names[2][1] ="Row8";
        names[2][2] ="Row9";

        for (int i=0; i<names.length; i++) {
            System.out.println();
            for(int j=0; j<names[i].length; j++) {
                System.out.print(names[i][j]+" ");
            }
        }

    }
}
