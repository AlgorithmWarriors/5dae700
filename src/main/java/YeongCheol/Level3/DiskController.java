package YeongCheol.Level3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DiskController {
    public class Job implements Comparable<Job>{
        public int start;
        public int process;

        public Job(int start, int process)
        {
            this.start = start;
            this.process = process;
        }

        @Override
        public int compareTo(Job o) {
            if(this.process < o.process)
            {
                return -1;
            }
            else if(this.process == o.process)
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
    }

    public int solution(int[][] jobs) {
        int answer = 0;
        int currentStartTime = 0;
        int idx = 0;
        PriorityQueue<Job> jobQueue = new PriorityQueue<>();
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        do{
            while (idx < jobs.length && jobs[idx][0] <= currentStartTime)
            {
                jobQueue.offer(new Job(jobs[idx][0], jobs[idx][1]));
                idx++;
            }
            if(jobQueue.isEmpty())
            {
                currentStartTime = jobs[idx][0];
            }
            else
            {
                Job job = jobQueue.poll();
                currentStartTime += job.process;
                answer += currentStartTime - job.start;
            }
        } while(idx < jobs.length || !jobQueue.isEmpty());
        answer /= jobs.length;
        return answer;
    }
}
