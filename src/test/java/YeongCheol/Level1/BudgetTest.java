package YeongCheol.Level1;

import YeongCheol.Level1.Budget;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class BudgetTest {
    @Test
    public void 예산테스트(){
        Budget budget = new Budget();
        assertThat(budget.solution(new int[]{1,3,2,5,4}, 9), is(3));
        assertThat(budget.solution(new int[]{2,2,3,3}, 10), is(4));
    }
}
