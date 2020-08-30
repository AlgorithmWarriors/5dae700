package Chunghee.Level2;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class RemoveInPairsTest {
    @Test
    public void 짝지어제거하기테스트(){
        RemoveInPairs removeInPairs = new RemoveInPairs();
        String[] myStrings = {"baabaa","cdcd"};
        int[] result = {1,0};
        for(int i=0;i<myStrings.length;i++) {
            assertThat(removeInPairs.solution(myStrings[i]), is(result[i]));
        }
    }
}
