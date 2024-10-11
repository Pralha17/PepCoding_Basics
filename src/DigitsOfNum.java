import java.util.*;
public class DigitsOfNum {
    public static void main(String[] args) {
        int n, temp, rem, count = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        temp = n;
        while(temp!=0){
            temp /= 10;
            count++;
        }
        int div = (int)Math.pow(10,count-1);
        while(div!=0){
            rem = n / div;
            System.out.println(rem);
            n = n % div;
            div = div / 10;
        }
    }
}
