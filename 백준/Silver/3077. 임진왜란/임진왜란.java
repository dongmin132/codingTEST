import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i<n;i++) {
            map.put(sc.next(),i);
        }

        String [] arr = new String[n];

        for(int i = 0 ;i<n;i++) {
            arr[i] = sc.next();
        }

        for(int i = 0;i<n-1;i++) {
            for(int j = i+1;j<n;j++) {
                if(map.get(arr[i])<map.get(arr[j])) {
                    ans++;
                }
            }
        }

        System.out.println(ans+"/"+n*(n-1)/2);

    }
}