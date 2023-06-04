package b06.b0604;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3613 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int [] arr = new int[n];
        int maxNumber = 0;
        int maxIndex = -1;

        for(int i =0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(maxNumber < arr[i]) {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }
        // 20 30 40 30 20
        // 20+40 -> 30+40
        // 40+30 -> 30+20
        // 가장 큰 숫자의 위치를 찾기?
        // 그 숫자를 기준으로 전부 합치기! =>
        int answer = 0;
        // 일단 그 숫자 기준 오른쪽 합쳐버리기


        // 2040 3040
        if(maxIndex > 0) {
            for(int i=0; i<maxIndex; i++) {
                answer += maxNumber + arr[i];
            }
        }

        // 그 숫자 기준 오른쪽
        //
        for(int i=maxIndex+1; i<n; i++) {
            answer += maxNumber + arr[i];
        }

        System.out.println(answer);

        br.close();
    }
}
