package Chunghee;

import Chunghee.Level2.TruckAndBridge;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class TruckAndBridgeTest {
    @Test
    public void 다리를지나는트럭테스트(){
        int []bridge_length ={2,100,100};
        int []weight={10,100,100};
        int[][]truck_weights ={{7,4,5,6},{10},{10,10,10,10,10,10,10,10,10,10}};
        TruckAndBridge truckAndBridge = new TruckAndBridge();
        assertThat(truckAndBridge.solution(bridge_length[0],weight[0],truck_weights[0]),is(8));
        assertThat(truckAndBridge.solution(bridge_length[1],weight[1],truck_weights[1]),is(101));
        assertThat(truckAndBridge.solution(bridge_length[2],weight[2],truck_weights[2]),is(110));
    }
}
