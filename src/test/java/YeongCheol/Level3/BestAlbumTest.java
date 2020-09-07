package YeongCheol.Level3;

import YeongCheol.Level3.BestAlbum;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class BestAlbumTest {
    @Test
    public void 디스크컨트롤러(){
        BestAlbum bestAlbum = new BestAlbum();
        assertThat(bestAlbum.solution(new String[]{"classic", "pop", "classic", "classic", "pop"},
                new int[]{500, 600, 150, 800, 2500}), is(new int[]{4,1,3,0}));
    }
}
