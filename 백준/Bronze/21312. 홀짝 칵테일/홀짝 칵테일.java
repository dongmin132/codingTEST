import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();

        if(n%2==0 && k%2==0 && m%2==0){
            System.out.println(n*k*m);
        } else{
            System.out.println(odd(n)*odd(k)*odd(m));
        }
    }
    public static int odd(int num){
        return num%2==1?num:1;
    }
}