package YeongCheol.Level1;

import YeongCheol.Level1.DartGame;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class DartGameTest {
    @Test
    public void 다트테스트(){
        DartGame dartGame = new DartGame();
        assertThat(dartGame.solution("1S2D*3T"), is(37));
        assertThat(dartGame.solution("1D2S#10S"), is(9));
        assertThat(dartGame.solution("1D2S0T"), is(3));
        assertThat(dartGame.solution("1S*2T*3S"), is(23));
        assertThat(dartGame.solution("1D#2S*3S"), is(5));
        assertThat(dartGame.solution("1T2D3D#"), is(-4));
        assertThat(dartGame.solution("1D2S3T*"), is(59));
    }
}
