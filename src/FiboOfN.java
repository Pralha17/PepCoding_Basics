import java.util.*;
public class FiboOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, prev = 0, next = 1,temp;
        System.out.println("Enter the fibonacci of number:");
        n = in.nextInt();
        if(n==1){
            System.out.println(prev);
        }
        else {
            for (int i = 2; i <= n; i++) {
                temp = prev + next;
                prev = next;
                next = temp;
            }
            System.out.println(prev);
        }
    }
}
