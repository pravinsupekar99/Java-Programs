public class PatternRightangle {
    /*
        11
        12 13
        13 14 15
        14 15 16 17
    */

    public static void main(String[] args) {
        int start = 11;
        int rows = 4;

        for (int i = 0; i < rows; i++) {
            int number = start + i;
            for (int j = 0; j <= i; j++) {
               // System.out.print(start +(i+j)+" ");
                System.out.print(number +" ");
                   number++;
            }
            System.out.println();
        }
    }

}
