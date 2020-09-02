package YeongCheol.Level2;

import YeongCheol.Level2.MoreSpicy;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MoreSpicyTest {
    @Test
    public void 더맵게(){
        MoreSpicy moreSpicy = new MoreSpicy();
        assertThat(moreSpicy.solution(new int[]{1,2,3,9,10,12}, 7), is(2));
    }
}
