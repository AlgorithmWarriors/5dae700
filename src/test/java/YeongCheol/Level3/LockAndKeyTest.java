package YeongCheol.Level3;

import YeongCheol.Level3.LockAndKey;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class LockAndKeyTest {
    @Test
    public void 자물쇠와열쇠(){
        LockAndKey lockAndKey = new LockAndKey();
        assertThat(lockAndKey.solution(new int[][]{{0,0,0},{1,0,0},{0,1,1}}, new int[][]{{1,1,1},{1,1,0},{1,0,1}}), is(true));
    }
}
