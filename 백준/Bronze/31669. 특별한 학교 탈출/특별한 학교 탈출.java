import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int i;

        for(i = 0; i < m; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[j].charAt(i) == 'X') {
                    count++;
                }
            }
            if(count == n) {
                System.out.println(i + 1);
                break;
            }
        }

        if(i == m) {
            System.out.println("ESCAPE FAILED");
        }
    }
}