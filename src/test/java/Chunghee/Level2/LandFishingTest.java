package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class LandFishingTest {
    @Test
    public void 땅따먹기테스트(){
        int[][]land ={{1,2,3,5},{5,6,7,8,},{4,3,2,1}};
        LandFishing landFishing = new LandFishing();
        assertThat(landFishing.solution(land),is(16));
    }
}
