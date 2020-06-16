package Chunghee;

import Chunghee.Level2.countryOf124;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class countryOf124Test {
    @Test
    public void 숫자나라테스트(){
        countryOf124 mycountryOf124 = new countryOf124();
        /*
        assertThat(mycountryOf124.solution(1),is("1"));
        assertThat(mycountryOf124.solution(2),is("2"));
        assertThat(mycountryOf124.solution(3),is("4"));
        assertThat(mycountryOf124.solution(4),is("11"));
        assertThat(mycountryOf124.solution(5),is("12"));
        assertThat(mycountryOf124.solution(6),is("14"));
        assertThat(mycountryOf124.solution(7),is("21"));
        assertThat(mycountryOf124.solution(8),is("22"));
        assertThat(mycountryOf124.solution(9),is("24"));*/
        assertThat(mycountryOf124.solution(14),is("112"));
    }


}
