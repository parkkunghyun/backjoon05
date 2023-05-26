package b05.b0526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b16198 {
    static int [][] arr;
    static boolean [] visited;
    static int N;
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        visited = new boolean[N];
        for(int i =0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        dfs(0);
        System.out.println(result);

        br.close();
    }

    public static void dfs(int depth) {
        if(depth == N) {
            int ssn = 0;
            int sin = 1;
            boolean isflag = false;

            for(int i =0; i<N; i++) {
                if(visited[i]) {
                    sin *= arr[i][0];
                    ssn += arr[i][1];
                    isflag = true;
                }
            }

            // 한번도 안 거칠때
            if(isflag==false) {
                return;
            }

            result = Math.min(result, Math.abs(sin-ssn));
            return;
        }

        visited[depth] =true;
        dfs(depth+1);
        visited[depth] = false;
        dfs(depth+1);
    }
}
