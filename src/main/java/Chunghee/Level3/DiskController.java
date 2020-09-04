package Chunghee.Level3;

import java.util.*;

public class DiskController {
    class job{
        int waitTime;
        int workTime;
        job(int i,int j){
            this.waitTime = i;
            this.workTime = j;
        }
    }
    public int solution(int[][] jobs) {
        int answer = 0;
        int count = 0;
        LinkedList<job>WaitQueue = new LinkedList<>();
        PriorityQueue<job> workQueue = new PriorityQueue<>(new Comparator<job>() {
            @Override
            public int compare(job o1, job o2) {
                return o1.workTime-o2.workTime;
            }
        });

        for(int[] myjob:jobs){
            WaitQueue.offer(new job(myjob[0],myjob[1]));
        }

        Collections.sort(WaitQueue, new Comparator<job>() {
            @Override
            public int compare(job o1, job o2) {
                return o1.waitTime-o2.waitTime;
            }
        });
        int time  = WaitQueue.peek().waitTime;
        while (count<jobs.length){
            while (!WaitQueue.isEmpty()&&WaitQueue.peek().waitTime<=time){
                workQueue.offer(WaitQueue.pollFirst());
            }
            if(!workQueue.isEmpty()){
                job Job = workQueue.poll();
                time += Job.workTime;
                answer +=time -Job.waitTime;
                count++;
            }
            else {
                time++;
            }
        }


        return answer/count;
    }
}
