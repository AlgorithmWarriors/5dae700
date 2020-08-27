package Chunghee.Level2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class LZWCompressionTest {
    @Test
    public void 압축테스트(){
        String[] msg = {"KAKAO","TOBEORNOTTOBEORTOBEORNOT",	"ABABABABABABABAB"};
        int[][] answer ={{11, 1, 27, 15},{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34},
                {1, 2, 27, 29, 28, 31, 30}};
        LZWCompression lzwCompression = new LZWCompression();
        assertThat(lzwCompression.solution(msg[0]),is(answer[0]));

    }
}
