import java.util.Arrays;
public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,4,56,67,86,345,325};
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int target=69;
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int middle = (left+right)/2;
            if(target<arr[middle]){
                right=middle-1;
            }else if(target>arr[middle]){
                left=middle+1;
            }else if(target==arr[middle]){
                System.out.println(middle);
                break;
            }
            else System.out.println(arr[left]);
        }


    }
}
