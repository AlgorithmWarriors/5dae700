package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class MaxAndMinTest {
    @Test
    public void 최댓값과최솟값(){
        String[] strings= {"1 2 3 4","-1 -2 -3 -4","-1 -1"};
        String[] answers={"1 4","-4 -1","-1 -1"};
        MaxAndMin maxAndMin = new MaxAndMin();
        for(int i=0;i<strings.length;i++) {
            assertThat(maxAndMin.solution(strings[i]),is(answers[i]));
        }
    }

}
