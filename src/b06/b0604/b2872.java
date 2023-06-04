package b06.b0604;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2872 {
    static boolean whatIsLanguage = false; // false => C++ true=> java
    static boolean allOfLower = true;

    public static void main(String[] args) throws IOException {


    }
    public static boolean name_check(StringBuilder sb) {
        int isUpperCase = 0;
        int isUnderBar = 0;

        for(int i=0; i<sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z') isUpperCase = 1;
            else if(ch == '_') isUnderBar = 1;
        }

        allOfLower = (isUnderBar == 1 || isUpperCase ==1) ? false : true;
        if( (isUnderBar & isUpperCase) ==0 || allOfLower ) {
            whatIsLanguage = (isUnderBar ==1) ? false : true;
            return true;
        }else return false;
    }

}
