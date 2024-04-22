import java.util.LinkedList;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        int ans=0;
        System.out.println("Enter the operation: ");
        while(true){
            char output=sc.next().trim().charAt(0);
            if(output == '+' || output == '-' || output == '*' || output == '/' ||output == '%') {
                if (output == '+') {
                    ans = num1 + num2;
                }
                if (output == '-') {
                    ans = num1 - num2;
                }
                if (output == '*') {
                    ans = num1 * num2;
                }
                if (output == '/')
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                if (output == '%') {
                    ans = num1 % num2;
                }
                LinkedList<Integer> list = new LinkedList<Integer>();
               break;
            } else {
                System.out.println("invalid");
            }

        } System.out.println("the answer is: " +ans);

    }
}
