import java.util.*;


public class Main {
    static int n;
    static int m;
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int s1 =  sc.nextInt();
        int s2 =  sc.nextInt();
        int s3 =  sc.nextInt();


        for(int i = 0; i<s1;i++) {
            for(int j =0;j< s2;j++) {
                for(int k = 0; k<s3;k++) {
                    int sum = i+j+k+3;
                    if(map.containsKey(sum)) {
                        map.put(sum,map.get(sum)+1);
                    }else {
                        map.put(sum,1);
                    }
                }
            }
        }

        int max = 0;
        int maxKey = 0;
        for(int key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                maxKey = key;
            }
        }
        System.out.println(maxKey);
    }


}