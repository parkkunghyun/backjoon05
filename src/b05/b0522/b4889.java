package b05.b0522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b4889 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;
        while(true) {
            String arr = br.readLine();
            if(arr.isEmpty()) {
                System.out.println(count +"." +" 0");
                count+=1;
                continue;
            }

            Character [] arr2 = new Character[arr.length()];
            for(int i =0; i< arr2.length; i++) {
                arr2[i] = arr.charAt(i);
            }

            if(arr2.length >=1 && arr2[0].equals('-')) {
                break;
            }

            int change = 0; // 이제부터는 괄호들어오니까 여기부터 바꾸기!
            Stack<Character> stack = new Stack<>();
            for(int i =0; i< arr2.length; i++) {
                if(stack.isEmpty()){
                    stack.push(arr2[i]);
                }
                else{
                    if(stack.peek().equals('{') && arr2[i].equals('}')) {
                        stack.pop();
                    }else {
                        stack.add(arr2[i]);
                    }
                }
            }



           ;
        }
        br.close();
    }
}
