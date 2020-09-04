package Chunghee.Level3;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class DiskControllerTest {
    @Test
    public void 디스크컨트롤러테스트(){
        int[][] jobs ={{0, 3}, {1, 9}, {2, 6}};
        DiskController diskController =new DiskController();
        assertThat(diskController.solution(jobs),is(9));
    }
}
