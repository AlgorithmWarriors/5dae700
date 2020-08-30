package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class ArrayCalculatorTest {
    @Test
    public void 행렬의곱셈(){
        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};
        int[][] answer = {{15,15},{15,15},{15,15}};
        ArrayCalculator arrayCalculator = new ArrayCalculator();
        assertThat(arrayCalculator.solution(arr1,arr2),is(answer));
    }
}
