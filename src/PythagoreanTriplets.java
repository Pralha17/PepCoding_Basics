import java.util.*;
public class PythagoreanTriplets {
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        boolean flag ;
        max = a;
        if(b > max)
            max = b;
        else if(c > max)
            max = c;
        if(max == a)
            flag = (c*c + b*b) == (a*a);
        else if(max == b)
            flag = (c*c + a*a) == (b*b);
        else
            flag = (b*b + a*a) == (c*c);
        System.out.println(flag);
    }
}
