import java.util.*;
public class occurance {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int r;
     int count=0;
     while(n>0){
        r = n%10;
        if(r==4){
            count++;
        }
        n=n/10;
     }
     System.out.println(count);
    }
}
