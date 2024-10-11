import java.util.*;
public class PrimeFactorisation {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int div = 2;div <= Math.sqrt(n);div++){
            while((n % div) == 0){
                n = n / div;
                System.out.println(div);
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
