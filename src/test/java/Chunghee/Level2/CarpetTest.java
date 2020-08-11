package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class CarpetTest {
    @Test
    public void 카펫테스트(){
        int[] brown = {10,8,24};
        int[] yellow= {2,1,24};
        int[][] result = {{4,3},{3,3},{8,6}};
        Carpet carpet = new Carpet();
        for(int i=0;i<brown.length;i++) {
            assertThat(carpet.solution(brown[i], yellow[i]), is(result[i]));
        }
    }
}
