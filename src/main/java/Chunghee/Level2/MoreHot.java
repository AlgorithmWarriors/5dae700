package Chunghee.Level2;

import java.util.PriorityQueue;
import java.util.Queue;

public class MoreHot {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> myQueue = new PriorityQueue<>();
        for(int task : scoville){
            myQueue.offer(task);
        }
        while (myQueue.peek()<K){
            if(myQueue.size()<=1)return -1;

            int first=myQueue.poll();
            int Second=myQueue.poll();
            myQueue.offer(first+Second*2);
            answer++;
        }
        return answer;
    }
}
