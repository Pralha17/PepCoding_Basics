import java.util.*;
public class Rotate_K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k, n;
        n = in.nextInt();
        k = in.nextInt();
        int count = 0, temp = n;
        while(temp!=0){
            temp /= 10;
            count++;
        }

        k = k % count;
        if(k<1){
            k = k + count;
        }

        int div = 1;
        int mul = 1;
        for(int i=1;i<=count;i++){
            if(i<=k){
                mul = mul * 10;
            }
            else{
                div = div * 10;
            }
        }

        int q = n / div;
        int rem = n % div;
        int result = (rem * mul) + q;
        System.out.println(result);
    }
}
