package b05.b0525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.util.Arrays.stream;

public class b2980 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = input[0], len = input[1], curPos = 0, time = 0;

        for (int i = 0; i < n; i++) {
            int[] arr = stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            // arr = { 위치, 빨간불, 파란불}
            time += arr[0] - curPos; // 다음 위치 까지 가는데 걸리는 시간
            curPos = arr[0]; // 위치 이동

            int section = time % (arr[1] + arr[2]); // 신호등 사이클 확인
            if (section < arr[1]) // 빨간불 구간
                time += arr[1] - section;
        }
        // 남은 신호등 거리 계산 포함
        System.out.println(time + len - curPos);
    }
}
