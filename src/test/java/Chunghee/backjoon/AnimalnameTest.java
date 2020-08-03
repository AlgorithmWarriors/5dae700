package Chunghee.backjoon;
import Chunghee.naver.Animalname;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class AnimalnameTest {
    @Test
    public void xptmxm(){
        String[] s = {"봄","가음","봄봄"};
        Animalname animalname = new Animalname();
        assertThat(animalname.solution(s),is(true));
    }
}
