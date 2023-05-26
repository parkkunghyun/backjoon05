package b05.b0526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b4889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = 1;
        while (true) {
            String bucket = br.readLine();
            if(bucket.contains("-")){
                break;
            }

            Stack<Character> stack = new Stack<>();
            int cnt = 0;

            for(int i =0; i<bucket.length(); i++) {
                char c = bucket.charAt(i);
                if(c=='{') {
                    stack.add(c);
                }else {
                    if(stack.isEmpty()) {
                        cnt++;
                        stack.add('{');
                    }else {
                        stack.pop();
                    }
                }
            }
            System.out.println(number+". " + (stack.size()/2 +cnt) );
            number +=1;

        }
        br.close();
    }
}
