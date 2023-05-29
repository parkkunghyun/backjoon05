package b05.b0529;

import java.io.*;
import java.util.*;

public class b1117 {
    static int k;
    static int [] all;
    static int [] arr;

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // k개의 추와 빈그릇
        // 1, 5, 7
        // 1 2 3 4 5 6 7 8 11 12 13
        // 백트래킹인듯? 전부 빼고 더하고 해서 확인하기!
        k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        arr = new int[k];
        int sum = 0;

        for(int i=0; i<k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        all = new int [sum+1];
        int cnt = 0;

        dfs(0,0);

        for(int i =1; i<=sum; i++) {
            if(all[i] ==0) {
                cnt++;
            }
        }
        System.out.println(cnt);


        bw.flush();
        bw.close();
        br.close();
    }


    public static void dfs(int depth, int sum) {
        if(depth ==k) {
            if(sum >0) {
                all[sum] = 1;
            }
            return;
        }

        dfs(depth+1, sum+arr[depth]);
        dfs(depth+1, sum-arr[depth]);
        dfs(depth+1, sum);

    }
}

