package Chunghee.Level3;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class IntegerTriangleTest {
    @Test
    public void 정수삼각형(){
        IntegerTriangle integerTriangle =new IntegerTriangle();
        int [][] triangle ={{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        assertThat(integerTriangle.solution(triangle),is(30));
    }
}
