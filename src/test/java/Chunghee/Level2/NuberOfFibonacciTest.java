package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class NuberOfFibonacciTest {
    @Test
    public void 피보나치수테스트(){
        int[] numbers = {3,2,10000};
        int[] answers = {2,1,1107030};
        NuberOfFibonacci nuberOfFibonacci = new NuberOfFibonacci();
        for(int i=0; i<numbers.length;i++) {
            assertThat(nuberOfFibonacci.solution(numbers[i]), is(answers[i]));
        }
    }
}
