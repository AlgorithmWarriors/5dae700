package YeongCheol.Level2;

import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedList;

public class CrossBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        LinkedList<SimpleEntry<Integer, Integer>> bridge = new LinkedList<SimpleEntry<Integer, Integer>>();
        int time = 1;
        int truckIdx = 0;
        int inBridgeWeight = 0;
        while(truckIdx < truck_weights.length)
        {
            if(bridge.size() > 0 && bridge.peek().getValue() == time)
            {
                inBridgeWeight -= truck_weights[bridge.poll().getKey()];
            }

            if(inBridgeWeight + truck_weights[truckIdx]  <= weight)
            {
                bridge.offer(new SimpleEntry<Integer, Integer>(truckIdx, time++ + bridge_length));
                inBridgeWeight += truck_weights[truckIdx++];
            }
            else
            {
                time = bridge.peek().getValue();
            }
        }
        if(bridge.size() > 0)
        {
            time = bridge.getLast().getValue();
        }

        return time;
    }
}
