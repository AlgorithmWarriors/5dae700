package Chunghee;
import Chunghee.backjoon.Make_1;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Make_1Test {
    @Test
    public void 하나로만들기확인(){
        Make_1 make_1= new Make_1();
        assertThat(make_1.solution(10),is(3));
        assertThat(make_1.solution(1),is(0));
        assertThat(make_1.solution(100),is(7));
        assertThat(make_1.solution(837),is(8));
    }
}
