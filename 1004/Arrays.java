public class Arrays  {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        intArr[2] = 5;
        intArr[1] = intArr[2] + 3;
        intArr[5] = intArr[1] - intArr[2];
        // What will these print out?
        System.out.println(intArr[2]);
        System.out.println(intArr[1]);
        System.out.println(intArr[5]);

        String[] stringArr = new String[5];
        System.out.println(stringArr[0]);

        double[] doubArr = {1.0, 2.0, 3.0, 4.0};
        // interating through each element in an array
        for (int i=0; i<doubArr.length; i++) {
            System.out.println(doubArr[i]);
        }
        
    }
}
