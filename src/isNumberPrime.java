import java.util.*;
public class isNumberPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t,n;
        System.out.print("Enter count t = ");
        t = in.nextInt();
        System.out.println("Enter integer numbers n =");
        for(int i=1;i<=t;i++){
            n = in.nextInt();
            if(isPrime(n))
                System.out.println(n+" is prime number");
            else
                System.out.println(n+" is not a prime number");
        }
    }
    public static boolean isPrime(int n){
        if (n<=1)
            return false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
