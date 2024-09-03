import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];

        for(int i = 0; i<n; ++i) {
            arr[i] = sc.next();
        }

        for(int i=1; i<=arr[0].length(); ++i) {
            for(int j=0; j<n; ++j) {
                set.add(arr[j].substring(arr[j].length()-i));
            }
            if(set.size() == n) {
                System.out.println(i);
                break;
            }
            set.clear();
        }
    }
}