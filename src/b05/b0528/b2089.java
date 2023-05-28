package b05.b0528;

import java.io.*;
import java.util.*;

public class b2089 {
    static int n;
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        sum = 0; // 실제 합계구하는 녀석!
        int i =1; // 몇번째 자리인지! 0부터 시작!

        StringBuilder sb = new StringBuilder();

        if(n ==0) {
            sb.append(0);
        }else {
            while(n!=1) {
                sb.append(Math.abs(n % -2));
                n = (int) (Math.ceil((double)n / -2));
                System.out.println(n + "is N!!");
            }
            sb.append(n);
        }
        // 6 -> 11010
        // 6 % -2 => 6 -3  2 -1 1
        // 나머지는    0  1  0  1  1
        System.out.println(sb.reverse());

        bw.flush();
        bw.close();
        br.close();
    }



}


