package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class lifeboatTest {
    @Test
    public void 구명보트테스트(){
        lifeboat myboat = new lifeboat();
        int[][] people ={{70, 50, 80, 50},{70, 80, 50}};
        int[] Limit = {100,100};
        int[] answer ={3,3};
        for(int i=0;i<1;i++) {
            assertThat(myboat.solution(people[i], Limit[i]), is(answer[i]));
        }
    }
}
