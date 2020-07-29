package YeongCheol.Level1;

import YeongCheol.Level1.Keypad;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class KeypadTest {
    @Test
    public void 키패드(){
        Keypad keypad = new Keypad();
        assertThat(keypad.solution(new int[]{1,3,4,5,8,2,1,4,5,9,5}, "right"), is("LRLLLRLLRRL"));
        assertThat(keypad.solution(new int[]{7,0,8,2,8,3,1,5,7,6,2}, "left"), is("LRLLRRLLLRR"));
        assertThat(keypad.solution(new int[]{1,2,3,4,5,6,7,8,9,0}, "right"), is("LLRLLRLLRL"));
    }
}
