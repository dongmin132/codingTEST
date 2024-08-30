import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        for(int i = 0; i<n;i++) {
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr,Collections.reverseOrder());

        int count = 0;
        int total = 0;
        for(int i = 0 ; i < n; i++) {
            if(i <42) {
                if (arr[i] >= 250) {
                    count += 5;
                } else if (arr[i] >= 200) {
                    count += 4;
                } else if (arr[i] >= 140) {
                    count += 3;
                } else if (arr[i] >= 100) {
                    count += 2;
                } else if (arr[i] >= 60) {
                    count += 1;
                }

                total += arr[i];
            }
        }

        System.out.println(total + " " + count);
    }

}