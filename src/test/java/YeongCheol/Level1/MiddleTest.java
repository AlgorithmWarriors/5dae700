package YeongCheol.Level1;

import YeongCheol.Level1.Middle;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class MiddleTest {
    @Test
    public void 가운데글자테스트(){
        Middle middle = new Middle();
        assertThat(middle.Solution("abcde"), is("c"));
        assertThat(middle.Solution("qwer"), is("we"));
    }
}
