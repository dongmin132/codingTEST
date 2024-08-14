import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int [9][9];
        for(int i = 0; i< 9; i++) {
            for(int j = 0; j< 9; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i< 9; i++) {
            for(int j = 0; j< 9; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((x+1) + " " + (y+1));
    }
}