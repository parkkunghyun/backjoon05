package b05.b0526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b2961 {
    static int N;
    static ArrayList<Integer> arr;
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr= new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        // N-2만큼 갔을때 안의 내용들 더해주기! 그리고 양옆 두개 곱해서 더해주기!
        dfs(arr, 0);
        System.out.println(result);
        br.close();
    }

    public static void dfs(ArrayList<Integer> arr, int sum) {
        if(arr.size()==2) {
            // 중앙 빼주고 나머지 양옆을 곱해서 더해주기! 그래서 결과랑 비교하기!
            result = Math.max(result, sum);
            return;
        }
        for(int i =1; i<arr.size()-1; i++) {
            int temp = arr.get(i);
            int num = arr.get(i-1) * arr.get(i+1);
            arr.remove(i);
            dfs(arr, sum+num);
            arr.add(i, temp);
        }

    }
}
