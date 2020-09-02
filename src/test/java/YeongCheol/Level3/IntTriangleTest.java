package YeongCheol.Level3;

import YeongCheol.Level3.IntTriangle;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class IntTriangleTest {
    @Test
    public void 정수삼각형(){
        IntTriangle intTriangle = new IntTriangle();
        assertThat(intTriangle.solution(new int[][]{{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}}), is(30));
    }
}
