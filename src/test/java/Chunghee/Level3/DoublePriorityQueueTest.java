package Chunghee.Level3;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class DoublePriorityQueueTest {
    @Test
    public void 이중나선큐()
    {
        DoublePriorityQueue doublePriorityQueue =new DoublePriorityQueue();
        String[][] operations ={{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"},
                                {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"}};
        int[][ ]answer = {{7,5},{0,0}};
        assertThat(doublePriorityQueue.solution(operations[1]),is(answer[1]));
    }
}
