package Chunghee.Level3;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TwoNTilingTest {
    @Test
    public void TwoNTiling테스트(){
        TwoNTiling twoNTiling = new TwoNTiling();
        assertThat(twoNTiling.solution(4),is(5));
    }
}
