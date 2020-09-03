package YeongCheol.Level2;

import java.util.PriorityQueue;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int input : scoville)
        {
            minHeap.offer(input);
        }
        while(minHeap.size() >= 2 && K >= minHeap.peek())
        {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int mix = first + (second * 2);
            minHeap.offer(mix);
            answer++;
        }
        if(K >= minHeap.peek())
        {
            return -1;
        }
        return answer;
    }
}
