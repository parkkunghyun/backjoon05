package b05.b0530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b15970 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 좌표와 색깔 -> 색깔끼리 모으자
        // 순서대로 나오는게 아님 그러면 너무 쉬워서
        //

       Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i =0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int point = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());

            if(!map.containsKey(color)) {
                map.put(color, new ArrayList<>());
                map.get(color).add(point);
            }else {
                map.get(color).add(point);
            }
        }

        int ans = 0;
        Set<Integer> keys = map.keySet();
        for(int key: keys) {
            ArrayList<Integer> arr = map.get(key);
            Collections.sort(arr);

            for(int i=0; i<arr.size(); i++) {
                if(i==0) {
                    ans += arr.get(i+1) - arr.get(i);
                } else if(i== arr.size()-1) {
                    ans += arr.get(i) - arr.get(i-1);
                } else {
                    int t = arr.get(i+1) - arr.get(i);
                    int f = arr.get(i) - arr.get(i-1);
                    ans += Math.min(t,f);
                }
            }
        }

        System.out.println(ans);

        br.close();
    }
}
