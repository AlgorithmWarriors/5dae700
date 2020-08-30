package Chunghee.Level2;

import java.util.*;

public class H_index {
    public int solution(int[] citations) {
        int answer = 0;
        Queue<Integer> myStack = new PriorityQueue<>(Collections.reverseOrder());
        for(int task : citations){
            myStack.offer(task);
        }

        for(int i=0; i<citations.length;i++){
           answer=Math.max(answer,Math.min(myStack.poll(),i+1));
        }
        return answer;
    }
}
