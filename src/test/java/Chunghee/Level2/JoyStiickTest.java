package Chunghee.Level2;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JoyStiickTest {
    @Test
    public void 조이스틱테스트(){
        String[] name={"JEROEN","JAN","JAZ","AAA"};
        int [] ansewr={56,23,11,0};
        JoyStiick joyStiick = new JoyStiick();
        assertThat(joyStiick.solution(name[0]),is(ansewr[0]));
        assertThat(joyStiick.solution(name[1]),is(ansewr[1]));
        assertThat(joyStiick.solution(name[2]),is(ansewr[2]));
        assertThat(joyStiick.solution(name[3]),is(ansewr[3]));
    }
}
