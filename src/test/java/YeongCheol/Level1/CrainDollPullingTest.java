package YeongCheol.Level1;

import YeongCheol.Level1.CrainDollPulling;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class CrainDollPullingTest {
    @Test
    public void 인형뽑기테스트(){
        CrainDollPulling crainDollPulling = new CrainDollPulling();
        assertThat(crainDollPulling.solution(new int[][]{
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        }, new int[]{1,5,3,5,1,2,1,4}), is(4));
    }
}
