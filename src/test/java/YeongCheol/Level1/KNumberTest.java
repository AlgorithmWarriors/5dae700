package YeongCheol.Level1;

import YeongCheol.Level1.KNumber;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class KNumberTest {
    @Test
    public void K번째수(){
        KNumber kNumber = new KNumber();
        assertThat(kNumber.solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}}), is(new int[]{5,6,3}));
    }
}
