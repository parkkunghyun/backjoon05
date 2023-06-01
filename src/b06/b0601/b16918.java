package b06.b0601;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b16918 {
    static int R,C,N;
    static char [][] map;
    static Queue<int []> q = new LinkedList<>();
    static int [] dy = {-1,1,0,0};
    static int [] dx = {0,0,1,-1};

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new char[R][C];

        for(int i =0; i<R; i++) {
            String s = br.readLine();
            for(int j =0; j<C; j++) {
                char dot = s.charAt(j);
                map[i][j] = dot;
                if(dot == 'O') {
                    q.add(new int[]{i,j});
                }
            }
        }
        // 짝수일때는 다 채우기 -> 그러면 그전에 일단 폭발한 남은 형태 가지고 있어야함!
        // 홀수일때는 터트려서 잔해만 남기기 -> 남은 0 위치를 큐에 저장하기!
        for(int i =2; i<=N; i++) {
            if(i%2 ==0) {
                for(char [] m : map) {
                    Arrays.fill(m, 'O');
                }
            }
            else {
                // 홀수면 큐에 담긴 애들 데리고다가 일단 터트리기 그리고 남은 형태에서 큐에 넣기!
                bfs();

                // 이제 큐에 담기!
                for(int k=0; k<R; k++) {
                    for(int z = 0; z<C; z++) {
                        if(map[k][z] == 'O') {
                            q.add(new int[]{k,z});
                        }
                    }
                }
                //
            }
        }

        if(N%2 == 0) {
            for(char [] m : map) {
                Arrays.fill(m, 'O');
            }
        }

        for(int i=0; i<R; i++) {
            for(int j =0; j<C; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void bfs() {
        while(!q.isEmpty()) {
            int [] point = q.poll();
            int y = point[0];
            int x = point[1];
            map[y][x] = '.';
            for(int i =0; i<4; i++) {
                int sy = y + dy[i];
                int sx = x + dx[i];
                if(0<=sy && sy < R && 0<=sx && sx <C ) {
                    if(map[sy][sx]=='O') {
                        map[sy][sx] ='.';
                    }

                }
            }


        }
    }
}
