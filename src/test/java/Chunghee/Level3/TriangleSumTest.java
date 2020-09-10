package Chunghee.Level3;
import Chunghee.TriangleSum;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class TriangleSumTest {
    @Test
    public void 삼각형합테스트(){
        int[] answer = {1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11};
        TriangleSum triangleSum = new TriangleSum();
        assertThat(triangleSum.solution(6),is(answer));
    }
}
