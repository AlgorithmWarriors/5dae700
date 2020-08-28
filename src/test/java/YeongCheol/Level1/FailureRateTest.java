package YeongCheol.Level1;

import YeongCheol.Level1.FailureRate;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class FailureRateTest {
    @Test
    public void 실패율검사(){
        FailureRate failureRate = new FailureRate();
        assertThat(failureRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}), is(new int[]{3,4,2,1,5}));
        assertThat(failureRate.solution(4, new int[]{4,4,4,4,4}), is(new int[]{4,1,2,3}));
    }
}
