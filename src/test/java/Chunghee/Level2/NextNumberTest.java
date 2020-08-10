package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class NextNumberTest {
    @Test
    public void 다음으로큰숫자(){
        int[] numbers= {1,78,15};
        int[] answers= {2,83,23};
        NextNumber nextNumber= new NextNumber();
        for(int i=0; i<3;i++){
            assertThat(nextNumber.solution(numbers[i]),is(answers[i]));
        }
    }
}
