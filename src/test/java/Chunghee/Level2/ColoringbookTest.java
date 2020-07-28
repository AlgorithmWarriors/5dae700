package Chunghee.Level2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class ColoringbookTest {
    @Test
    public void 컬러링북테스트(){
        Coloringbook coloringbook = new Coloringbook();
        int[] answer={4,5};
        int[][] picture ={
                {1, 1, 1, 0},
                {1, 2, 2, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 3},
                {0, 0, 0, 3}};
        assertThat(coloringbook.solution(6,4,picture),is(answer));

    }
}
