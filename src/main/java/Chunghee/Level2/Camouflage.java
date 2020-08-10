package Chunghee.Level2;

import java.util.HashMap;

public class Camouflage {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> spyWear = new HashMap<>();

        for(int i=0; i<clothes.length;i++){
            spyWear.put(clothes[i][1],0);
        }

        for(int i=0; i<clothes.length;i++){
            spyWear.put(clothes[i][1],spyWear.get(clothes[i][1])+Integer.valueOf(1));
        }
        for(String keys : spyWear.keySet())
            answer=answer*(spyWear.get(keys).intValue()+1);

        answer =answer-1;
        return answer;
    }
}
