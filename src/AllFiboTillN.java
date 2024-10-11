import java.util.*;
public class AllFiboTillN {
    public static void main(String[] args) {
        int n, prev = 0, next = 1, temp;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(prev);
            temp = prev + next;
            prev = next;
            next = temp;
        }
    }
}
