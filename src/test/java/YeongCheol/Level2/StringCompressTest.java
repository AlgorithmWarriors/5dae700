package YeongCheol.Level2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class StringCompressTest {
    @Test
    public void 문자열압축(){
        StringCompress stringCompress = new StringCompress();
        assertThat(stringCompress.solution("aabbaccc"), is(7));
        assertThat(stringCompress.solution("ababcdcdababcdcd"), is(9));
        assertThat(stringCompress.solution("abcabcdede"), is(8));
        assertThat(stringCompress.solution("abcabcabcabcdededededede"), is(14));
        assertThat(stringCompress.solution("xababcdcdababcdcd"), is(17));
    }
}
