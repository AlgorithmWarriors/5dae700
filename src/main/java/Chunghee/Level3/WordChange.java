package Chunghee.Level3;

import java.util.ArrayList;

public class WordChange {
    static int answer = 1000;
    static boolean[] check;
    static String[] myword;
    public int solution(String begin, String target, String[] words) {
        if(begin.equals(target))return 0;
        myword = words;
        check = new boolean[words.length];
        Changword(begin,target,0,words.length);
        if(answer==1000)return 0;

        return answer;
    }

    private void Changword(String begin, String target, int index, int length) {
        if(index>length)answer=0;
        if(target.equals(begin))answer=Math.min(answer,index);
        for(int i=0;i<length;i++){
            if(differentAlphatbetNumber(myword[i],begin)<2&&!check[i]){
                check[i]=true;
                Changword(myword[i],target,index+1,length);
                check[i]=false;
            }
        }

    }
    public int differentAlphatbetNumber(String s1,String s2){
        int result =0;
        char[] s1_array=s1.toCharArray();
        char[] s2_array=s2.toCharArray();
        for(int i=0;i<s1_array.length;i++){
            if(s1_array[i]!=s2_array[i])result++;
        }
        return result;
    }
}
