import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {

        int[] InputArr = new int[7];

        InputArr[0] = 1;
        InputArr[1] = 8;
        InputArr[2] = 5;
        InputArr[3] = 3;
        InputArr[4] = 9;
        InputArr[5] = 4;
        InputArr[6] = 2;

        for(int x=1; x<12; x++) {
            selectionSortAlg(InputArr);
        }

    }

    public static void selectionSortAlg(int[] arrInput) {
        int currentMin;
        int temp1;
        int temp2;
        boolean breakLoop = false;
        int inc=0;
        while (!breakLoop) {

                for (int j =  0; j < arrInput.length-1; j++) {
                    currentMin = arrInput[inc];

                    if (currentMin > arrInput[j+1]) {
                        temp1 = currentMin;
                        temp2 = arrInput[j+1];
                       // System.out.print(arrInput[j]+" ");
                        arrInput[j+1] = temp1;
                        arrInput[j] = temp2;
                        breakLoop = true;
                        inc++;
                    }

                    inc++;
                    if (inc==arrInput.length-1){
                        breakLoop = true;

                        break;
                    }
                }
            }


        System.out.println(Arrays.toString(arrInput));


    }
}
