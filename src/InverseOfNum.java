import java.util.*;
public class InverseOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, od, op=1;
        n = in.nextInt();
        int inv = 0;
        while(n!=0){
            od = n % 10;
            inv = inv + (op * (int)Math.pow(10,od-1));
            n = n / 10;
            op++;
        }
        System.out.println(inv);

    }
}
