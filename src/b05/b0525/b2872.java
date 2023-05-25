package b05.b0525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class b2872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i =0; i<N; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        int result = 0;
        Collections.reverse(arrayList);

        int target = N;

        for(int i =0; i<N; i++) {
            if(arrayList.get(i) == target) {
                target--;
            }else{
                result++;
            }
        }

        System.out.println(result);

        br.close();
    }
}
