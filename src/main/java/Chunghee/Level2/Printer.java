package Chunghee.Level2;

import java.util.*;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> myStack = new PriorityQueue<>(Collections.reverseOrder());
        for(int task : priorities){
            myStack.offer(task);
        }
        while (!myStack.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (myStack.peek() == priorities[i]) {
                    myStack.poll();
                    answer++;
                    if (location == i) {
                        myStack.clear();
                        break;
                    }
                }
            }
        }
        return answer;
    }

}
