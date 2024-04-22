import java.util.*;
public class lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm=1;
        while(lcm>0){

            if(lcm%num1==0 && lcm%num2==0){
                System.out.println("The lcm of two numbers is : "+lcm);
                break;
            }
            else{
                lcm++;
            }
        }
    }
}
