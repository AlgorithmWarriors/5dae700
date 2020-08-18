package Chunghee.Level2;


import java.util.Stack;

public class ChangeBracket {
    public String solution(String p) {
        String answer = "";
        answer = correctBracket(p);
        return answer;
    }

    private String correctBracket(String p) {
        int StartBrack = 0;
        if(p.length()==0)return "";
        char startChar = p.charAt(0);
        int i=0;
        if(startChar=='('){
            while (StartBrack==0) {
                if (p.charAt(i) == startChar) StartBrack++;
                else if (StartBrack > 0) StartBrack--;
            }
            return correctBracket(p.substring(0,i))+correctBracket(p.substring(i+1,p.length()));
        }
        return correctBracket(p.substring(0,i))+correctBracket(p.substring(i+1,p.length()));
    }
}
