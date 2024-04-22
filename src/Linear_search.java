import java.util.*;
public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,23,35,45,34,325,1,24,12,43};
        int target = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                System.out.println(i);
                break;
            }
            else{
                continue;
            }
        }
    }
}
