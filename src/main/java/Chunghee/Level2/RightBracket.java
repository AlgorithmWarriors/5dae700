package Chunghee.Level2;

import java.util.Stack;

public class RightBracket {
    boolean solution(String s) {
        char [] myString = s.toCharArray();
        Stack<String>Start =new Stack<>();
        for(int i=0;i<myString.length;i++){
            if(myString[i]==')') {
                if (Start.isEmpty()) return false;
                else Start.pop();
            }
            else Start.push("1");
        }
        if(!Start.isEmpty())return false;

        return true;
    }
}
