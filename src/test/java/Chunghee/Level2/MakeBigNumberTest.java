package Chunghee.Level2;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class MakeBigNumberTest {
    @Test
    public void 큰수만들기테스트(){
        MakeBigNumber makeBigNumber = new MakeBigNumber();
        String[] strings ={"1924","1231234","4177252841"};
        int[] ks={2,3,4};
        String[] ansewrs={"94","3234","775841"};
        //assertThat(makeBigNumber.solution(strings[0],ks[0]),is(ansewrs[0]));
        //assertThat(makeBigNumber.solution(strings[1],ks[1]),is(ansewrs[1]));
        assertThat(makeBigNumber.solution(strings[2],ks[2]),is(ansewrs[2]));
    }
}
