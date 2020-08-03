package Chunghee.Level1;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class SportsWearTest {
    @Test
    public void 체육북테스트(){
        SportsWear sportsWear = new SportsWear();
        int[] n ={5,5,3};
        int[][] lost={{2,4},{2,4},{3}};
        int[][] reserve = {{1,3,5},{3},{1}};
        int[] answer = {5,4,2};
        for(int i=0;i<2;i++) {
            assertThat(sportsWear.solution(n[i], lost[i], reserve[i]), is(answer[i]));
        }
    }
}
