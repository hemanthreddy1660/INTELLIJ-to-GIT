public class sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(15));
    }
        static long mySqrt(int x) {
            long start=1;
            long end =x;
           // long ans=0;
            while(start<=end){
               long mid = (start+end)/2;
               if(mid*mid<=x){
                   //ans+=mid;
                   start=mid+1;
               }
               else{
                   end=mid-1;
               }
            }return end;
        }
    }

