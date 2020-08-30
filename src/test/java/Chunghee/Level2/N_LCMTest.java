package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class N_LCMTest {
    @Test
    public void N개의최소공배수(){
        int[][] arrs = {{2,6,8,14},{1,2,3},{2,3,4},{14,2,7}};
        int[] result = {168,6,12,14};
        N_LCM n_lcm = new N_LCM();
        assertThat(n_lcm.solution(arrs[2]),is(result[2]));
    }
}
