import java.util.Arrays;

public class bubbleSort {


    public static void main(String[] args) {
        int [] InputArr = new int[5];
        InputArr[0] = 5;
        InputArr[1] = 1;
        InputArr[2] = 4;
        InputArr[3] = 2;
        InputArr[4] = 8;


    bubbleSortAlg(InputArr);
    }



    public static void bubbleSortAlg(int[] arrInput){


        System.out.println(Arrays.toString(arrInput));

    }
}
