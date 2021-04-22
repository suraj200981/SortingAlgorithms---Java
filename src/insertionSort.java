import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {

        int[] InputArr = new int[8];

        InputArr[0] = 60;
        InputArr[1] = 56;
        InputArr[2] = 90;
        InputArr[3] = 2;
        InputArr[4] = 32;
        InputArr[5] = 83;
        InputArr[6] = 12;
        InputArr[7] = 22;


        selectionSortAlg(InputArr);

    }

    public static void selectionSortAlg(int[] arr) {
        int current;
        int temp1 = 0;
        for (int x = 0; x < arr.length - 1; x++) {//8
            current = arr[x];//8
            int j = x - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;

        }
        System.out.println(Arrays.toString(arr));
    }

}
