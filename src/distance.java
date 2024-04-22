import java.util.*;
public class distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextInt();
        double y1 = in.nextInt();
        double x2 = in.nextInt();
        double y2 = in.nextInt();
        double distance = Math.sqrt((x2-x1)*(x2-x1) +(y2-y1)*(y2-y1));
        System.out.println(distance);
    }
}
