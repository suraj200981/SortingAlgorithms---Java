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

    public static void heapSortAlg(int [] arr){

        int temp1 = 0;
        int temp2;

        //First find largest in the heap
        for(int x=0; x<arr.length-1; x++){

            if (arr[x]<arr[x+1]){
                temp1 = arr[x+1];
            }
        }
        System.out.println(temp1);




    }
}
