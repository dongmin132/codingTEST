import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        int chicken = Integer.parseInt(sc.next());

        int answer = (N+M)>=chicken*2 ? (N+M)-(chicken*2) : N+M;

        System.out.println(answer);

    }
}