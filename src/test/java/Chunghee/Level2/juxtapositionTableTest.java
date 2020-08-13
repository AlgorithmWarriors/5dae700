package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class juxtapositionTableTest {
    @Test
    public void 예상대진표(){
        int[] totalMatch = {8,8,8};
        int[] a = {1,2,4};
        int[] b = {2,3,7};
        int[] result = {1,2,3};
        juxtapositionTable juxtapositionTable = new juxtapositionTable();
        for(int i=0;i<totalMatch.length;i++) {
            assertThat(juxtapositionTable.solution(totalMatch[i],a[i],b[i]),is(result[i]));
        }
    }

}
