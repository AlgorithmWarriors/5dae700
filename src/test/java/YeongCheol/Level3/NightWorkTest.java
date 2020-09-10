package YeongCheol.Level3;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class NightWorkTest {
    @Test
    public void 야근지수(){
        NightWork nightWork = new NightWork();
        assertThat(nightWork.solution(4, new int[]{4,3,3}), is(12L));
        assertThat(nightWork.solution(1, new int[]{2,1,2}), is(6L));
        assertThat(nightWork.solution(3, new int[]{1,1}), is(0L));
    }
}
