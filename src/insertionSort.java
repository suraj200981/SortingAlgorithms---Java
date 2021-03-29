import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {

        int[] InputArr = new int[5];

        InputArr[0] = 8;
        InputArr[1] = 2;
        InputArr[2] = 4;
        InputArr[3] = 1;
        InputArr[4] = 3;


        selectionSortAlg(InputArr);

    }

    public static void selectionSortAlg(int[] arr) {
        int current;
        int temp1 = 0;
        for (int x = 0; x < arr.length - 1; x++) {//8
                current = arr[x];//8

            for(int j =x+1; j<arr.length-1; j++) {//2

                if(current>arr[j]){
                    temp1 = arr[j];
                    arr[j] = current;//8
                    arr[x] = temp1;//2
                }
                current = temp1;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
