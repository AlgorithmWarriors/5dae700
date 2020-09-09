package YeongCheol.Level2;

import YeongCheol.Level2.OneTwoFour;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class OneTwoFourTest {
    @Test
    public void 일이사(){
        OneTwoFour oneTwoFour = new OneTwoFour();
        assertThat(oneTwoFour.solution(1), is("1"));
        assertThat(oneTwoFour.solution(2), is("2"));
        assertThat(oneTwoFour.solution(3), is("4"));
        assertThat(oneTwoFour.solution(4), is("11"));
    }
}
