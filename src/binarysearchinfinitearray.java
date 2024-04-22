public class binarysearchinfinitearray {
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
     // int target=12;
        System.out.println(ans(arr,16));
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart = end+1;
             end = end+(end-start+1)*2;
             start=newstart;
        }return binarysearch(start,end,target,arr);
    }
    static int binarysearch(int start,int end,int target,int[] arr){
        //int middle=start+(end-start)/2;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(target<arr[middle]){
                end=middle-1;
            } else if (target>arr[middle]) {
                start=middle+1;
            }else{
                return middle;
            }
        }return -1;

    }
}
