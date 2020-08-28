package YeongCheol.Level2;

import YeongCheol.Level2.PrimeMaker;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class PrimeMakerTest {
    @Test
    public void 소수개수(){
        PrimeMaker primeMaker = new PrimeMaker();
        assertThat(primeMaker.solution(new int[]{1,2,3,4}), is(1));
        assertThat(primeMaker.solution(new int[]{1,2,7,6,4}), is(4));
    }
}
