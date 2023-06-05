package b06.b0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b6986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 절사평균(양쪽 제외)과 보정평균(양쪽 바꾸기) 구하기
        // 소수점 셋짜 자리에서 반올림 -> String.format()?
        // 우선순위 큐를 두개 만들어서 넣어서 구하기?

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        double [] arr = new double[n];
        for(int i=0; i<n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }
        Arrays.sort(arr);

        // 절사평균
        double result1 = 0;
        for(int i =k; i<n-k; i++) {
            result1 += arr[i];
        }
        result1 = result1 / (n-2*k);
        System.out.println(String.format("%.2f", result1));

        // 보정평균
        double result2 = 0;
        for(int i =0; i<k; i++) {
            arr[i] = arr[k];
            arr[n-i-1] = arr[n-k-1];
        }
        for(int i =0; i<n; i++) {
            result2 += arr[i];
        }
        result2 = result2 /n;
        System.out.println(String.format("%.2f", result2));




        br.close();
    }
}
