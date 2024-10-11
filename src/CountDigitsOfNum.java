import java.util.*;
public class CountDigitsOfNum {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner in =  new Scanner(System.in);
        n = in.nextInt();
        while(n!=0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
