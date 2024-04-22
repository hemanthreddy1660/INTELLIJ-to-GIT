import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int sum  =0;
        int product =1;
        int a = 0;
        while(n>0){
            a   = n%10;
            sum = sum+a;
            product=product*a;
            n = n/10;
        }
        System.out.println(product-sum);


    }
}