import java.sql.SQLOutput;
import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int a = str.length();
        System.out.println(a);
        int b=0;
        int c=0;
        while(n>0){
           b = (int) Math.pow(n%10,a);
           c = c+b;
           n=n/10;
        }
        System.out.println(c);
        if(n==c){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
