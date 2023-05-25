package b05.b0524;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        double minAnswer = Integer.MAX_VALUE;

        int [] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i =0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=K; i<=N; i++) {
            for(int j =0; j<=N-i; j++) {
                int sum = 0;

                for(int z = j; z<j+i; z++) {
                    sum += arr[z];
                }
                int avg = sum/i; // 평균
                double sum2 = 0;
                // 평균 2
                for(int z = j; z<j+i; z++) {
                    sum2 += Math.pow(Math.abs(arr[z]-avg), 2 );
                }
                //System.out.println(sum2 + ", "+ i);
                if(Math.sqrt(sum2/i) < minAnswer ) {
                    minAnswer = Math.sqrt(sum2/i);
                }


            }
        }

        System.out.println(String.format("%.11f" ,minAnswer));
        br.close();
    }
}
