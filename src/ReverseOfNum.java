import java.util.*;
public class ReverseOfNum {
    public static void main(String[] args) {
        int num, rem, rev = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer number:");
        num = in.nextInt();
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            System.out.println(rem);
            num /= 10;
        }
    }
}
