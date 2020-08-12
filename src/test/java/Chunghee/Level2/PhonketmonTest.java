package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class PhonketmonTest {
    @Test
    public void 폰켓몬테스트(){
        int[][] nums = {{3,1,2,3},{3,3,3,2,2,4},{3,3,3,2,2,2}};
        int[] result ={2,3,2};
        Phonketmon phonketmon = new Phonketmon();
        for(int i=0; i<nums.length;i++){
            assertThat(phonketmon.solution(nums[i]),is(result[i]));
        }
    }
}
