package b05.b0521;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class b14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 착한아이 만날때마다 가장 가치 있는 선물주기!
        // 선물없으면 -1
        // 일단 저장을 하고 0일때마다 가장 큰거를 주기! 없으면 -1을!!

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0; i<N; i++) {
            String [] arr = br.readLine().split(" ");
            if(arr.length ==1 && arr[0].equals("0")) {
                if(pq.isEmpty()) {
                    System.out.println(-1);
                }else {
                    int s = -pq.poll();
                    System.out.println(s);
                }
            }else {
                // 배열 순서대로 저장하기!
                for(int j =1; j<arr.length; j++) {
                    int value =Integer.parseInt(arr[j]);
                    pq.add(-value);
                }
            }
        }

        br.close();
    }

}
