import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String name;
        n = in.nextInt();
        name = in.nextLine();
        System.out.println("Hello "+name+". here is your counting...");
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}