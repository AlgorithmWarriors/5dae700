package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class StockPriceTest {
    @Test
    public void 주식가격테스트(){
        StockPrice stockPrice = new StockPrice();
        int[][] prices = {{1, 2, 3, 2, 3},{5,4,3,2,2}};
        int[][] answer ={{4, 3, 1, 1, 0},{1,1,1,1,0}};
        assertThat(stockPrice.solution(prices[1]),is(answer[1]));
    }
}
