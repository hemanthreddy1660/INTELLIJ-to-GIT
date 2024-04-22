import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long fact=1;
        while(num>0){
           fact = fact*num;
           num--;
        }
        System.out.println(fact);

    }
}
