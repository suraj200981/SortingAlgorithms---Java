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
        int beginning;
        int current;
        int tempCurrent;
        int[] newInputArr = new int[5];

        for (int x = 0; x < arr.length - 1; x++) {
                beginning = arr[x];//8
            if(arr[x]>arr[x+1]){
                current = arr[x+1];
                arr[x+1] =beginning;
                beginning = current;
                arr[x]= beginning;
                //sorted
            }
            for(int j =x+1; j<arr.length-1; j++) {
                if(arr[j]<beginning){


                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
