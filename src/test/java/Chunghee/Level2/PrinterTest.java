package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrinterTest {
    @Test
    public void 프린터테스트(){
        Printer printer = new Printer();
        int[][] priorities={{2, 1, 3, 2},{1, 1, 9, 1, 1, 1},{9,9,9,9,9}};
        int[] location={2,0,4};
        int[] result={1,5,5};
        for(int i =0;i<2;i++) {
            assertThat(printer.solution(priorities[i], location[i]), is(result[i]));
        }
    }
}
