import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i]= sc.next();
            char key = arr[i].charAt(0);
            map.put(key,map.getOrDefault(key,0)+1);
        }

        for(char key : map.keySet()) {
            if(map.get(key) >= 5) {
                System.out.print(key);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("PREDAJA");
        }
    }
}