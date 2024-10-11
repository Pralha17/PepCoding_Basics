import java.util.*;
public class gcdLcmOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n2, n1, rem, on1, on2;
        n2 = in.nextInt();
        n1 = in.nextInt();
        on1 = n1;
        on2 = n2;
        while(n1%n2 != 0){
            rem = n1 % n2;
            n1 = n2 ;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;
        System.out.println("Gcd of "+on1+" and "+on2+" is = "+gcd);
        System.out.println("Lcm of "+on1+" and "+on2+" is = "+lcm);
    }
}
