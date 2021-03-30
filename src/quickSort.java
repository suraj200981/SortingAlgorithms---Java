import java.util.Arrays;
import java.util.Collections;

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
        int temp1;
        int temp2;


            for (int x = arr[arr.length-1]; x>=0; x--) {
                int indexOfPivot = getArrayIndex(arr,3);


                if (arr[x] >pivot) {

                    temp1 = arr[indexOfPivot];//3
                    temp2 = arr[x];//8

                    arr[x] = temp1;// 3
                    arr[indexOfPivot] = temp2;//8

                }
            }
        System.out.println(Arrays.toString(arr));

    }
    public static int getArrayIndex(int[] arr, int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
        return k;
    }



    }

