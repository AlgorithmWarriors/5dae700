package Chunghee.backjoon;
import Chunghee.backjoon.DynamicPrograming.Plus1_2_3;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Plus1_2_3Test {
    @Test
    public void 플러스123테스트(){
        Plus1_2_3 plus1_2_3 = new Plus1_2_3();
        assertThat(plus1_2_3.solution(1),is(1));
        assertThat(plus1_2_3.solution(2),is(2));
        assertThat(plus1_2_3.solution(7),is(44));
        assertThat(plus1_2_3.solution(10),is(274));
    }
}
