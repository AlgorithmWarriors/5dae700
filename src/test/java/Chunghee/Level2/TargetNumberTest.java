package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class TargetNumberTest {
    @Test
    public void 타겟넘버테스트(){
        TargetNumber targetNumber =new TargetNumber();
        int[] nunbers = {1,1,1,1,1};
        assertThat(targetNumber.solution(nunbers,3),is(5));
    }
}
