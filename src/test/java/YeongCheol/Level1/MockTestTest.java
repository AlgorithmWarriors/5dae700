package YeongCheol.Level1;

import YeongCheol.Level1.MockTest;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class MockTestTest {
    @Test
    public void 가운데글자테스트(){
        MockTest mockTest = new MockTest();
        assertThat(mockTest.solution(new int[]{1,2,3,4,5}), is(new int[]{1}));
        assertThat(mockTest.solution(new int[]{1,3,2,4,2}), is(new int[]{1,2,3}));
    }
}
