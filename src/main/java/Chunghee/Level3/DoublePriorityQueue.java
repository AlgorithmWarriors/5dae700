package Chunghee.Level3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        Queue<Integer> ascending = new PriorityQueue<>();
        Queue<Integer> descending =new PriorityQueue<>(Comparator.reverseOrder());

        for(String operation :operations){
            String[] comend = operation.split(" ");
            if(comend[0].equals("I")) {
                ascending.add(Integer.valueOf(comend[1]));
                descending.add(Integer.valueOf(comend[1]));
            }
            else if(comend[0].equals("D")&&!ascending.isEmpty()){
                if(comend[1].equals("-1")) {
                    int min = ascending.peek();
                    ascending.remove(min);
                    descending.remove(min);
                }
                else if(comend[1].equals("1")) {
                    int max = descending.peek();
                    descending.remove(max);
                    ascending.remove(max);
                }
            }
        }

        if(!ascending.isEmpty()) {
            answer[1] = ascending.poll();
            answer[0] = descending.poll();
        }
        return answer;
    }
}
