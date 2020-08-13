package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class PerfectSquareTest {
    @Test
    public void 멀쩡한사각형(){
        PerfectSquare perfectSquare = new PerfectSquare();
        assertThat(perfectSquare.solution(8,12),is((long)80));
    }
}
