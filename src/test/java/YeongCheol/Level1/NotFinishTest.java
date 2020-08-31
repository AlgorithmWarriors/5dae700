package YeongCheol.Level1;

import YeongCheol.Level1.NotFinish;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotFinishTest {
    @Test
    public void 완주하지못한자(){
        NotFinish notFinish = new NotFinish();
        assertThat(notFinish.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}), is("leo"));
        assertThat(notFinish.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina",  "nikola"}), is("vinko"));
        assertThat(notFinish.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}), is("mislav"));
    }
}
