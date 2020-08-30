package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class biggestNumberTest {
    @Test
    public void 가장큰수테스트(){
        biggestNumber mybiggestNumber = new biggestNumber();
        int[][] numbers = {{6, 10, 2},{3, 30, 34, 5, 9}};
        String[] answers={"6210","9534330"};
        for(int i=0;i<1;i++) {
            assertThat(mybiggestNumber.solution(numbers[i]), is(answers[i]));
        }
    }
}
