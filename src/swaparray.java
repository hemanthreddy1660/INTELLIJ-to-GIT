import java.util.*;
class main{
    public static void swaparray(String[] args) {
        int[] arr = {1, 2, 43, 423, 2354};
        System.out.println(Arrays.toString(arr));
        swap(arr,3,1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}