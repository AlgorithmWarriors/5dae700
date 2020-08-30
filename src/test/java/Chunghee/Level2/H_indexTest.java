package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class H_indexTest {
    @Test
    public void H인덱스테스트(){
        H_index h_index = new H_index();
        int[][] citations= {{5,5,5,5},{3, 0, 6, 1, 5}};
        assertThat(h_index.solution(citations[0]),is(4));
    }
}
