package Chunghee.Level2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class StringCompresionTest {
    @Test
    public void 문자열압축테스트(){
        StringCompresion stringCompresion = new StringCompresion();
        assertThat(stringCompresion.solution("aabbaccc"),is(7));
        assertThat(stringCompresion.solution("ababcdcdababcdcd"),is(9));
        assertThat(stringCompresion.solution("abcabcdede"),is(8));
        assertThat(stringCompresion.solution("abcabcabcabcdededededede"),is(14));
        assertThat(stringCompresion.solution("xababcdcdababcdcd"),is(17));
    }
}
