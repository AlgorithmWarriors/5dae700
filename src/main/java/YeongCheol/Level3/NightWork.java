package YeongCheol.Level3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NightWork {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> workHeap = new PriorityQueue<>((o1,o2) -> o2 - o1);
        if(n > Arrays.stream(works).sum())
        {
            return 0;
        }

        for (int work:works)
        {
            workHeap.offer(work);
        }
        while(n-- > 0)
        {
            int newWork = workHeap.poll() - 1;
            workHeap.offer(newWork);
        }
        for(int work : workHeap)
        {
            answer += work * work;
        }
        return answer;
    }
}
