package YeongCheol.Level2;

import YeongCheol.Level2.StockStack;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class StockStackTest {
    @Test
    public void 주식가격(){
        StockStack stockStack = new StockStack();
        assertThat(stockStack.solution(new int[]{1,2,3,2,3}), is(new int[]{4,3,1,1,0}));
    }
}
