package b05.b0528;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class b2852 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int oneScore = 0;
        int twoScore = 0;

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        s1.add(0);
        s2.add(0);
        int currentWinner = 0;

        for(int i =0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int teamNumber = Integer.parseInt(st.nextToken());
            String [] time = st.nextToken().split(":");

            if(teamNumber ==1 ){
                oneScore+=1;
                if(currentWinner == 1) {
                    continue;
                }else {
                    s1.add(Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]));
                    currentWinner = 1;
                }

            }
            else {
                twoScore +=1;
                if(currentWinner == 2) {
                    continue;
                }else {
                    s2.add(Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]));
                    currentWinner = 2;
                }
            }

            if(oneScore == twoScore) {

                int s1Score = s1.peek();
                int s2Score = s2.peek();


                if(s1Score > s2Score) {
                    s2.add(s1Score-s2Score);
                } else {
                    s1.add(s2Score-s1Score);
                }

                currentWinner = 0;
            }

        }
        int s1Result = s1.peek();
        int s2Result = s2.peek();

        if(s1Result > s2Result) {
            s1Result = (48*60) - s1Result;

            int s1Div = s1Result/60;
            int s1Mod = s1Result%60;
            StringBuilder s11 = new StringBuilder();
            if(s1Div<10) {
                s11.append("0");
                s11.append(String.valueOf(s1Div));
            }
            else {
                s11.append(String.valueOf(s1Div));
            }
            s11.append(":");

            if(s1Mod<10) {
                s11.append("0");
                s11.append(String.valueOf(s1Mod));
            }else {
                s11.append(String.valueOf(s1Mod));
            }

            int s2Div = s2Result/60;
            int s2Mod = s2Result%60;
            StringBuilder s22 = new StringBuilder();
            if(s2Div<10) {
                s22.append("0");
                s22.append(String.valueOf(s2Div));
            }
            else {
                s22.append(String.valueOf(s2Div));
            }
            s22.append(":");

            if(s2Mod<10) {
                s22.append("0");
                s22.append(String.valueOf(s2Mod));
            }else {
                s22.append(String.valueOf(s2Mod));
            }

            System.out.println(s11.toString());
            System.out.println(s22.toString());


        }else {
            s2Result = (48*60) - s2Result;

            int s1Div = s1Result/60;
            int s1Mod = s1Result%60;
            StringBuilder s11 = new StringBuilder();
            if(s1Div<10) {
                s11.append("0");
                s11.append(String.valueOf(s1Div));
            }
            else {
                s11.append(String.valueOf(s1Div));
            }
            s11.append(":");

            if(s1Mod<10) {
                s11.append("0");
                s11.append(String.valueOf(s1Mod));
            }else {
                s11.append(String.valueOf(s1Mod));
            }

            int s2Div = s2Result/60;
            int s2Mod = s2Result%60;
            StringBuilder s22 = new StringBuilder();
            if(s2Div<10) {
                s22.append("0");
                s22.append(String.valueOf(s2Div));
            }
            else {
                s22.append(String.valueOf(s2Div));
            }
            s22.append(":");

            if(s2Mod<10) {
                s22.append("0");
                s22.append(String.valueOf(s2Mod));
            }else {
                s22.append(String.valueOf(s2Mod));
            }


            System.out.println(s11.toString());
            System.out.println(s22.toString());

        }

        bw.flush();
        bw.close();
        br.close();
    }

}
