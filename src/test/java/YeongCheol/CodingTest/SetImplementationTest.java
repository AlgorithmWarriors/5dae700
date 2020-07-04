package YeongCheol.CodingTest;

import YeongCheol.CodingTest.SetImplementation;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class SetImplementationTest {
    @Test
    public void 집합검사(){
        SetImplementation setImplementation = new SetImplementation();
        assertThat(setImplementation.solution(new int[]{1,2,3,2}, new int[]{1,3}), is(new int[]{3,2,3,1,2}));
        assertThat(setImplementation.solution(new int[]{2,3,4,3,5}, new int[]{1,6,7}), is(new int[]{4,3,7,4,0}));
    }
}
