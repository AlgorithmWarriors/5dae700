package Chunghee.Level3;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class ExpressWithNTest {
    ExpressWithN expressWithN = new ExpressWithN();
    @Test
    public void N으로표현(){
        assertThat(expressWithN.solution(5,12),is(4));
        assertThat(expressWithN.solution(2,11),is(3));
    }
}
