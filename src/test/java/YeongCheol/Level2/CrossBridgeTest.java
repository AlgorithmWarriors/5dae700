package YeongCheol.Level2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class CrossBridgeTest {
    @Test
    public void 완전한사각형(){
        CrossBridge crossBridge = new CrossBridge();
        assertThat(crossBridge.solution(2, 10, new int[]{7,4,5,6}), is(8));
        assertThat(crossBridge.solution(100, 100, new int[]{10}), is(101));
        assertThat(crossBridge.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}), is(110));
    }
}
