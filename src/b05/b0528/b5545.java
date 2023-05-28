package b05.b0528;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class b5545 {
    static int N;
    static double result;
    static int dowPrice;
    static int toppingPrice;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        dowPrice = Integer.parseInt(st.nextToken());
        toppingPrice = Integer.parseInt(st.nextToken());

        int dowCal = Integer.parseInt(br.readLine());

        Integer [] arr = new Integer[N];
        for(int i =0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr , Collections.reverseOrder());
        result =(double)dowCal / dowPrice;

        // 도우칼로리 + 토핑 칼로리 = 칼로리
        // 도우가격 + 토핑* 토핑개수 = 가격
        int sumCal = dowCal;
        int sumPrice = dowPrice;
        // 칼로리 / 도핑 이 만약 result 보다 작으면 멈추기!
        for(int i =0; i<N; i++) {
            sumCal += arr[i];
            sumPrice += toppingPrice;
            if(result < ((double) sumCal / sumPrice) ) {
                result = ((double) sumCal / sumPrice);
            }else {
                break;
            }
        }
        System.out.println((int)Math.floor(result));

        // 소수점 버리고 만들기!

        bw.flush();
        bw.close();
        br.close();
    }
    // 300 200 100 50

}
