package b05.b0525;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b2635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i =N; i>=N/2; i--) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(N);

            int temp = N;
            int temp2 = i;

            while (true) {
                if(temp<0) break;
                int temp3 = temp;

                if(temp2 >= 0) list.add(temp2);

                temp = temp2;
                temp2 = temp3 - temp;
            }
            if(count<list.size()) {
                count = list.size();
                result = list;
            }
        }
        System.out.println(count);
        for(Integer c: result) {
            System.out.print(c+" ");
        }




        br.close();
    }

}
