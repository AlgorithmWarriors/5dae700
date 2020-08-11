package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class MakeMinimumTest {
    @Test
    public void 최솟값만들기(){
        int[][]A = {{1,4,2},{1,2}};
        int[][]B ={{5,4,4},{3,4}};
        int[] answer = {29,10};
        MakeMinimum makeMinimum = new MakeMinimum();
        for(int i=0;i<A.length;i++){
            assertThat(makeMinimum.solution(A[i],B[i]),is(answer[i]));
        }
    }
}
