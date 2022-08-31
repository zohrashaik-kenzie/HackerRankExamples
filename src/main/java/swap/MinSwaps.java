package swap;

public class MinSwaps {

    private static int findMinSwaps(int[] arr){

        int min_swaps= 0, index = 0, temp;
        while (index < arr.length) {
            if(arr[index] != index + 1){
                //swap the one at index with the one at arr[index]
                temp = arr[index];
                arr[index] = arr[arr[index] - 1];
                arr[temp-1] = temp;
                min_swaps++;
            } else {
                index++;
            }
        }
        return min_swaps;
    }

    public static void main(String[] args){
        int arr[] = {7,1,3,2,4,5,6};
        System.out.println("Min Swaps = " + findMinSwaps(arr));
    }
}
