import java.util.Scanner;
import java.util.Stack;


public class Main {
    static int n;
    static int m;
    static boolean[][] graph;
    static boolean[] visited;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        m = Integer.parseInt(sc.nextLine());

        graph = new boolean[n+1][n+1];
        visited = new boolean[n+1];

        int x,y;
        for (int i = 0; i < m; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            graph[x][y] = true;
            graph[y][x] = true;
        }
        dfs(1);
        System.out.println(answer-1);

    }

    public static void dfs(int idx) {
        visited[idx] = true;
        answer++;
        for(int i = 1;i<=n;i++) {
            if(graph[idx][i] && !visited[i]) {
                dfs(i);
            }
        }
    }

}

