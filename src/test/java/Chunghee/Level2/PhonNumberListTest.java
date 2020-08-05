package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class PhonNumberListTest {
    @Test
    public void 전화번호목록테스트(){
        PhonNumberList phonNumberList = new PhonNumberList();
        String[][] Phonbook = {{"119", "97674223", "1195524421"},{"123","456","789"},{"12","123","1235","567","88"}};
        Boolean[] result ={false,true,false};
        for(int i=0;i<2;i++) {
            assertThat(phonNumberList.solution(Phonbook[i]), is(result[i]));
        }
    }
}
