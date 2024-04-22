public class ceiling {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15};
        System.out.println(search(arr,8));
    }
    static int search(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
       // int middle=start+(end-start)/2;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(target==arr[middle]){
                return arr[middle+1];
               // break;
            }
            else if(target>arr[middle]){
                start=middle+1;
            }else if(target<arr[middle]){
                end=middle-1;
            }
        }return arr[start];
    }
}
