import java.util.Arrays;

public class quickSort {
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
        int pivot;
        int itemFromLeft = 0;
        int itemFromRight = 0;

        pivot= arr[arr.length-1];

        for(int x=0; x<arr.length-1; x++) {
            for(int j=0; j<arr.length; j++) {

                if(arr[j]>pivot) {
                    itemFromLeft = arr[j];//8
                    for(int y=arr.length-2; y>0; y--) {

                        if(arr[y]<pivot) {
                            itemFromRight = arr[y];//1

                            arr[j] = itemFromRight;
                            arr[y] = itemFromLeft;
                            break;
                        }
                    }
                }
                break;
            }

        }


        System.out.println(Arrays.toString(arr));


    }
}
