package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MoreHotTest {
    @Test
    public void 더맵게테스트(){
        MoreHot moreHot = new MoreHot();
        int[] scoville ={1,2,3,9,10,12};
        int k = 7;
        int result = 2;
        assertThat(moreHot.solution(scoville,k),is(result));
    }
}
