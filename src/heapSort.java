import java.util.Arrays;

public class heapSort {
    public static void main(String[] args) {
        int[] InputArr = new int[6];

        InputArr[0] = 2;
        InputArr[1] = 8;
        InputArr[2] = 5;
        InputArr[3] = 3;
        InputArr[4] = 9;
        InputArr[5] = 1;


        heapSortAlg(InputArr);

    }

    public static void heapSortAlg(int[] arr) {

        System.out.println("build max heap:");
        System.out.println(Arrays.toString(buildMaxHeap(arr)));


    }

    public static int[] buildMaxHeap(int[] arrMaxHeap) {
        int temp1 = 0;//store biggest element
        int temp2 = arrMaxHeap[0]; // store first element in the array
        int temp3 = 0;


        //First find largest in the heap
        for (int x = 0; x < arrMaxHeap.length - 1; x++) {

            if (arrMaxHeap[x] < arrMaxHeap[x + 1]) {
                temp1 = arrMaxHeap[x + 1];//9
                arrMaxHeap[0] = temp1;
                temp3 = x + 1;
            }
        }//once 9 is found replace initial 9 pos with index 0 element

        arrMaxHeap[temp3] = temp2;

        return arrMaxHeap;


    }
}
