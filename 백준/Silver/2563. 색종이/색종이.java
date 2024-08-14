import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] square = new boolean[100][100];
        int n = sc.nextInt();
        int count =0;
        int[][] arr = new int[n][2];
        for(int i = 0;i<n;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int dx = x; dx < x+10; dx++) {
                for(int dy = y; dy < y+10; dy++) {
                    square[dx][dy] = true;
                }
            }
        }

        for(int i = 0 ; i< 100; i++) {
            for(int j =0;j<100; j++) {
                if(square[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}