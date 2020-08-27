package Chunghee.Level2;

import java.util.ArrayList;
import java.util.HashMap;

public class LZWCompression {
    public int[] solution(String msg) {
        HashMap<String,Integer> Dictionary = new HashMap<>();
        ArrayList<Integer> AnswerArray = new ArrayList<>();
        int index =0;
        int DictionaryIndex = 27;
        int[] answer = {};
        String word = ""+msg.charAt(0);
        for(char i ='A' ;i<='Z';i++){
            String keyword = i+"";
            Dictionary.put(keyword,i-64);
        }
        while (index!=msg.length()-1){
            word = word + msg.charAt(index+1);
            if(!Dictionary.containsKey(word)) {
                Dictionary.put(word,DictionaryIndex);
                DictionaryIndex++;
                AnswerArray.add(Dictionary.get(word.substring(0,word.length()-1)));
                word =""+msg.charAt(index+1);
            }
           index++;
       }
       AnswerArray.add(Dictionary.get(word));
        answer = AnswerArray.stream().mapToInt(i->i).toArray();

        return answer;
    }
}
