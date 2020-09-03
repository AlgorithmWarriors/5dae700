package YeongCheol.Level3;

import YeongCheol.Level3.IntTriangle;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class DiskControllerTest {
    @Test
    public void 디스크컨트롤러(){
        DiskController diskController = new DiskController();
        assertThat(diskController.solution(new int[][]{{0,3},{1,9},{2,6}}), is(9));
        assertThat(diskController.solution(new int[][]{{0,3},{4,3},{10,3}}), is(3));
        assertThat(diskController.solution(new int[][]{{0,10},{2,3},{9,3}}), is(9));
        assertThat(diskController.solution(new int[][]{{1,10},{3,3},{10,3}}), is(9));
        assertThat(diskController.solution(new int[][]{{0,10}}), is(10));
        assertThat(diskController.solution(new int[][]{{0,10},{4,10},{5,11},{15,2}}), is(15));
        assertThat(diskController.solution(new int[][]{{0,9},{0,4},{0,5},{0,7},{0,3}}), is(13));
    }
}
