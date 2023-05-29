package b05.b0529;

import java.io.*;
import java.util.StringTokenizer;

public class b1105 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // L R -> L <= <=R 8이 가장 적게 들어있는 수에 들어있는 8의 개수
        // 20억개 처음부터 다 찾기는 조금 에바인듯?

        // 앞에 써진 8의 개수가 뒤에R에도 같다면 그 수가 고정인듯?
        //
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String L = st.nextToken();
        String R = st.nextToken();

        int count = 0;
        // 1 808
        if(L.length() == R.length()) {

            for(int i =0; i<L.length(); i++)
            {
                if(L.charAt(i) != R.charAt(i))
                {
                    break;
                }else
                {
                    if(L.charAt(i)=='8') {
                        count++;
                    }
                }
            }

        }
        System.out.println(count);


        bw.flush();
        bw.close();
        br.close();
    }

}
