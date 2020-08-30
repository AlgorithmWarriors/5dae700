package Chunghee.Level2;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Cache {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        for(int i=0;i<cities.length;i++){
            cities[i]= cities[i].toLowerCase();
        }
        Queue<String> cacheQueue = new LinkedList<>();
        HashSet<String> cacheHash = new HashSet<>();
        for(int i=0;i<cities.length;i++){
            if(cacheHash.contains(cities[i])){
                Queue<String> temp = new LinkedList<>();
                int LRUSize = cacheQueue.size();
                for(int j=0;j<LRUSize;j++){
                    if(cacheQueue.peek().equals(cities[i])) {
                        cacheQueue.poll();
                        continue;
                    }
                    temp.add(cacheQueue.poll());
                }
                temp.add(cities[i]);
                cacheQueue = temp;
                answer++;
            }
            else{
                cacheHash.add(cities[i]);
                cacheQueue.add(cities[i]);
                answer+=5;
                if(cacheHash.size()>cacheSize){
                    cacheHash.remove(cacheQueue.poll());
                }
            }
        }

        return answer;
    }
}
