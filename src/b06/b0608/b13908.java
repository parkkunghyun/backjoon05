package b06.b0608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b13908 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] know;
    static int result =0;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {

        // 조합 다 눌러봄.. 미리 안 숫자가 있을대 가능한 비번 개수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         int n = Integer.parseInt(st.nextToken());
         int m = Integer.parseInt(st.nextToken());

         if (m!=0) {
             know = new int[m];
             st = new StringTokenizer(br.readLine());
             for(int i =0; i<m; i++) {
                 know[i] = Integer.parseInt(st.nextToken());
             }
         }
         dfs(0,n,m);
        System.out.println(result);

        br.close();
    }

    public static void dfs(int start, int end, int m) {
        if(start == end) {
            for(int i =0; i<m;i ++) {
                if(!stack.contains(know[i]))
                    return;
            }
            result++;
            return;
        }

        for(int i=0; i<=9; i++) {
            stack.add(i);
            dfs(start+1, end, m);
            stack.pop();
        }
    }
}
