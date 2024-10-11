import java.util.*;
public class Benjamanian_Bulb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter number of bulbs:");
        n = in.nextInt();
        System.out.println("Bulbs in ON state:");
        for(int i=1;(i*i) <= n;i++){
            System.out.println(i*i);
        }
    }
}

