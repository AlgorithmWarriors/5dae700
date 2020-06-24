package Chunghee.backjoon.BrouteForce;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class HanSuTest {
    @Test
    public void 한수테스트(){
        HanSu hanSu = new HanSu();
        assertThat(hanSu.solution(110),is(99));
        assertThat(hanSu.solution(1),is(1));
        assertThat(hanSu.solution(210),is(105));
        assertThat(hanSu.solution(1000),is(144));
    }
}
