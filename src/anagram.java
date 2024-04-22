import java.util.*;
class anagram{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        char[] a1 = new char[a.length()];
        char[] b1 = new char[b.length()];
        for(int i=0;i<a.length();i++){
            a1[i] = a.charAt(i);
        }
        for(int i=0;i<b.length();i++){
            b1[i] = b.charAt(i);
        }
        Arrays.sort(a1);
        Arrays.sort(b1);
        if(Arrays.equals(a1,b1))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
