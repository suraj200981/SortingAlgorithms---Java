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
        int temp1;
        int temp2;
        int[] newInputArr = new int[5];
        for(int j=0; j<4;j++) { //number of compares is 4
            for (int x = 0; x < arrInput.length - 1; x++) {

                if (arrInput[x] > arrInput[x + 1]) {

                    temp1 = arrInput[x + 1];//1
                    temp2 = arrInput[x];//5

                    arrInput[x] = temp1;// 1
                    arrInput[x + 1] = temp2;//5

                }
            }
        }
        System.out.println(Arrays.toString(arrInput));


    }
}
