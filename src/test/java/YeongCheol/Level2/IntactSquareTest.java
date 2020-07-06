package YeongCheol.Level2;

import YeongCheol.Level2.IntactSquare;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class IntactSquareTest {
    @Test
    public void 완전한사각형(){
        IntactSquare intactSquare = new IntactSquare();
        assertThat(intactSquare.solution(8, 12), is(80L));
        assertThat(intactSquare.solution(12, 8), is(80L));
        assertThat(intactSquare.solution(8, 8), is(56L));
        assertThat(intactSquare.solution(50000000, 50000000), is(2499999950000000L));
    }
}
