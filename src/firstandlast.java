import java.sql.SQLOutput;
import java.util.*;
public class firstandlast {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,4,4,5};
        int target=4;
        int[] ans = answer(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] answer(int[]arr,int target){
         int[] ans = {-1,-1};
         ans[0] = findnumber(arr,target,true);
         if(ans[0]!=-1){
             ans[1] = findnumber(arr,target,false);
         }return ans;
    }

    static int findnumber(int[] arr,int target,boolean findfirstindex){
        int answer=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                answer=mid;
                if(findfirstindex==true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }return answer;

    }
}
