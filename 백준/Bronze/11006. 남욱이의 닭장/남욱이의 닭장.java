import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(sc.next());
            int M = Integer.parseInt(sc.next());

            System.out.println(((M * 2) - N) + " " + (M - ((M * 2) - N)));
        }
    }
}