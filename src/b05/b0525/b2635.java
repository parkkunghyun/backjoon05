package b05.b0525;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 양의 정수 ->
        // 두번째 수는 양의 정수중 하나 선택
        // 세번째부터 모든 수는 앞의 수에서 앞의  수를 빼서 만든거
        // 3 -> 1-2
        // 음만들어지면 음 버리고 그만
        // 두번째수를 찾아서 그걸로 만든 수들과 개수를 구해라!

        int N = Integer.parseInt(br.readLine());


        br.close();
    }

}
