package b06.b0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b20115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // -10 -9 -6 -3 -2
        // 10+4.5 + 3 +1.5 + 1 =

        // 우선순위 큐 사용해서 정리하자!
        PriorityQueue<Integer> q = new PriorityQueue<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            int drink = -Integer.parseInt(st.nextToken());
            q.add(drink);
        }

        double result = -q.poll();
        while(!q.isEmpty()) {
            double drink = -q.poll();
            result += drink/2;
        }
        System.out.println(result);

        double [] arr = new double[10];
        Arrays.sort(arr);
        br.close();
    }
}
