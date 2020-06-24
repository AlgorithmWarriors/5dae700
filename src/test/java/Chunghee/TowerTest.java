package Chunghee;
import Chunghee.Level2.Tower;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class TowerTest {
    @Test
    public void 타워테스트()
    {
        Tower tower = new Tower();
        int[][] heights ={{6,9,5,7,4},{3,9,9,3,5,7,2},{1,5,3,6,7,6,5},{2,1,3}};
        int[][] result = {{0,0,2,2,4},{0,0,0,3,3,3,6},{0,0,2,0,0,5,6},{0,1,0}};
        assertThat(tower.solution(heights[0]),is(result[0]));
        assertThat(tower.solution(heights[1]),is(result[1]));
        assertThat(tower.solution(heights[2]),is(result[2]));
        assertThat(tower.solution(heights[3]),is(result[3]));
    }
}
