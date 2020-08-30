package Chunghee.Level2;

public class MaxAndMin {
    public String solution(String s) {
        String answer = "";
        String[] myString=s.split(" ");
        int Max,Min,Number;
        Max=Min=Integer.parseInt(myString[0]);
        for(int i=1;i<myString.length;i++){
            Number = Integer.parseInt(myString[i]);
            Max = Math.max(Max,Number);
            Min = Math.min(Min,Number);
        }
        return answer+Min+" "+Max;
    }

}
