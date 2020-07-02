package YeongCheol.Level1;

import YeongCheol.Level1.ReverseInteger;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ReverseIntegerTest {
    @Test
    public void 정수뒤집기(){
        ReverseInteger reverseInteger = new ReverseInteger();
        assertThat(reverseInteger.Solution(118372), is(873211L));
    }
}
