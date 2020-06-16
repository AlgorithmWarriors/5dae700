package Chunghee.Level2;

import java.util.*;

public class TruckAndBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Stack<Integer> TruckStack = new Stack<>();
        Stack<Integer> WeightStack = new Stack<>();

        Queue<Integer> TimeQueue = new LinkedList<>();
        int load=0;
        int time =0;

        for(int i=0; i<truck_weights.length;i++){
            TruckStack.push(truck_weights[truck_weights.length-i-1]);
        }

        while (!(TimeQueue.isEmpty()&&TruckStack.isEmpty())){
            time++;
            if(!TimeQueue.isEmpty()&&TimeQueue.peek()==time) {
                TimeQueue.poll();
                load = load - WeightStack.pop();
            }
            if(!TruckStack.isEmpty()&&load+TruckStack.peek()<=weight) {
                WeightStack.push(TruckStack.peek());
                load=load+TruckStack.pop() ;
                TimeQueue.offer(time+bridge_length);
            }
            else ;

        }
        return time;
    }
}
