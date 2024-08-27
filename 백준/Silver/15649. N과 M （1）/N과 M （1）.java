import java.util.*;


public class Main {
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        visit = new boolean[N];
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if(depth == M ) {
            for(int i=0; i<M;i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return ;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}