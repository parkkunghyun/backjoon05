package b05.b0524;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        int arr[][] = new int[N+1][4];

        for(int i =0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            // 처음은 번호!
            int number = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            arr[number][0] = gold;
            arr[number][1] = silver;
            arr[number][2] = bronze;
        }

        int rank = 1;
        for(int i =1; i<=N; i++) {
            if(arr[i][0] > arr[K][0]) {
                rank++;
            }else if( arr[i][0] == arr[K][0] && arr[i][1] > arr[K][1]) {
                rank++;
            }else if( arr[i][0] == arr[K][0] && arr[i][1] == arr[K][1] && arr[i][2] > arr[K][2]) {
                rank++;
            }
        }
        System.out.println(rank);

        br.close();
    }
}
