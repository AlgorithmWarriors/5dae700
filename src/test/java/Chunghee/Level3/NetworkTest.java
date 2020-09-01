package Chunghee.Level3;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class NetworkTest {
    @Test
    public void 정답() {
        Network network = new Network();
        int[] ns ={3,3};
        int[][][] computer = {{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}},{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}};
        int[] answer = {2,1};
        for(int i = 0; i<ns.length;i++) {
            assertThat(network.solution(ns[i], computer[i]), is(answer[i]));
        }
    }
}
