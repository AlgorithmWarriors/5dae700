package Chunghee.Level2;

import java.util.HashSet;

public class Shiritori {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashSet<String> hashSet = new HashSet<>();
        char wordStart;
        char wordEnd = words[0].charAt(words[0].length()-1);
        hashSet.add(words[0]);
        for(int i=1;i<words.length;i++){
            hashSet.add(words[i]);
            wordStart = words[i].charAt(0);
            if(hashSet.size()!=i+1||wordEnd==wordStart){
                answer[0]= i%n+1;
                answer[1]= i/n +1;
                return answer;
            }
            wordEnd = words[i].charAt(words[i].length()-1);
        }
        return answer;
    }
}
