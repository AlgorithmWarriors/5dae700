package Chunghee.backjoon.DynamicPrograming;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class FibonacciFuctionTest {

    @Test
    public void 피보나치테스트(){
        FibonacciFuction fibonacciFuction =new FibonacciFuction();
        int[][] answer = {{1,0},{0,1},{1,2}};
        assertThat(fibonacciFuction.solution(0),is(answer[0]));
        assertThat(fibonacciFuction.solution(1),is(answer[1]));
        assertThat(fibonacciFuction.solution(3),is(answer[2]));
    }

}
