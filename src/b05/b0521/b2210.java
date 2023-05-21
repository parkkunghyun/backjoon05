package b05.b0521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class b2210 {
    static String [][] numberBoard;
    static Set<String> set = new HashSet<>();
    static int [] positionY = {-1,1,0,0};
    static int [] positionX = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 백트래킹인듯? 깊이는 5-6으로 하고
        // set써야할라나? -> 다 완성되면 저장하는 공간으로다가
        numberBoard = new String[5][5];
        for(int i=0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j =0; j<5; j++) {
                numberBoard[i][j] = st.nextToken();
            }
        }
        for(int i =0; i<5; i++) {
            for(int j =0; j<5; j++) {
                dfs(1, numberBoard[i][j], i,j);
            }
        }
        System.out.println(set.size());
        br.close();
    }

    public static void dfs(int depth, String numberWord, int y, int x) {
        if(depth == 6) {
            set.add(numberWord);
            return;
        }

        for(int i =0; i<4; i++) {
            int sy = y + positionY[i];
            int sx = x + positionX[i];

            if(0<= sy && 0<= sx && sy<5 && sx<5 ) {
                dfs(depth+1, numberWord+ numberBoard[sy][sx], sy,sx );
            }
        }

    }
}
