package b06.b0601;
import java.io.*;
import java.util.*;

public class b15970 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 색깔에 대해서 각 색깔마다 거리를 오름차순으로 정렬하고
        // 처음과 끝 제외하고 양옆 거리 살펴서 최단 거리를 서로 지정하기
        int n = Integer.parseInt(br.readLine());
        Map<Integer , ArrayList<Integer> > map = new HashMap<>();

        for(int i =0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int index = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());

            if(map.containsKey(color)) {
                map.get(color).add(index);
            } else {
                ArrayList<Integer> arr = new ArrayList<>();
                map.put(color, arr);
                map.get(color).add(index);
            }
        }

        int ans = 0;
        Set<Integer>set = map.keySet();


        for(Integer index : set) {
            ArrayList<Integer> arr  = map.get(index);
            Collections.sort(arr);

            for(int i =0; i<arr.size(); i++) {
                if(i==0) {
                    ans += arr.get(i+1) - arr.get(i);
                }else if (i == arr.size()-1) {
                    ans += arr.get(i) - arr.get(i-1);
                }
                else {
                    int t = arr.get(i+1) - arr.get(i);
                    int f = arr.get(i) - arr.get(i-1);
                    ans += Math.min(t,f);
                }
            }
        }
        System.out.println(ans);
        bw.flush();
        bw.close();
        br.close();
    }
}
