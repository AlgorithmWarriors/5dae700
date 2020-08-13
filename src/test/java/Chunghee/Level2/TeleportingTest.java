package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class TeleportingTest {
    @Test
    public void 점프와순간이동테스트(){
        int[] TestNumbers = {5,6,5000};
        int[] result = {2,2,5};
        Teleporting teleporting = new Teleporting();
        for(int i=0;i<TestNumbers.length;i++) {
            assertThat(teleporting.solution(TestNumbers[i]), is(result[i]));
        }
    }
}
