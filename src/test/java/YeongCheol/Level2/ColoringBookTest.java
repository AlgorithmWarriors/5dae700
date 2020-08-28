package YeongCheol.Level2;

import YeongCheol.Level2.ColoringBook;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class ColoringBookTest {
    @Test
    public void 완전한사각형(){
        ColoringBook coloringBook = new ColoringBook();
        assertThat(coloringBook.solution(6,4,new int[][]{{1,1,1,0}, {1,2,2,0}, {1,0,0,1}, {0,0,0,1}, {0,0,0,3}, {0,0,0,3}}), is(new int[]{4,5}));
    }
}
