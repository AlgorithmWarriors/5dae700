package Chunghee.Level2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class NdecimalGameTest {
    @Test
    public void n진법게임테스트(){
        NdecimalGame ndecimalGame = new NdecimalGame();
        assertThat(ndecimalGame.solution(2,4,2,1),is("0111"));
        assertThat(ndecimalGame.solution(16,16,2,1),is("02468ACE11111111"));
    }
}
