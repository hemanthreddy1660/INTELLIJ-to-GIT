public class leetcode69 {
    public static void main(String[] args) {
        int x=8;
        int start=0;
        int end=x;
        int ans=0;
       // System.out.println(target);
        while(start>=end){
            int middle=start+(end-start)/2;
            if(middle*middle<x){
                end=middle-1;
            }else{
                start=middle+1;
            }ans=ans+middle;
            System.out.println(ans);
        }
    }
}
