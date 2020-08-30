package Chunghee.Level2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class MAkePrimeNumberTest {
    @Test
    public void 소수만들기테스트(){
        int[][] nums ={{1,2,3,4},{1,2,7,6,4}};
        int[] result={1,4};
        MAkePrimeNumber mAkePrimeNumber = new MAkePrimeNumber();
        for(int i=0; i<nums.length;i++) {
            assertThat(mAkePrimeNumber.solution(nums[i]), is(result[i]));
        }
    }
}
