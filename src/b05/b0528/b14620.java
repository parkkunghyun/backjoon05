package b05.b0528;

import javax.imageio.IIOException;
import java.io.*;
import java.util.StringTokenizer;

public class b14620 {
    static int N;
    static int [][] map;
    static boolean [][] visited;

    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i =0; i<N;i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j =0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited = new boolean[N][N];


        bw.flush();
        bw.close();
        br.close();
    }
}
