package Chunghee.backjoon.Search;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class GroupWordTest {
    @Test
    public void 그룹단어테스트(){
        GroupWord groupWord = new GroupWord();
        assertThat(groupWord.solution("happy"),is(true));
        assertThat(groupWord.solution("new"),is(true));
        assertThat(groupWord.solution("year"),is(true));
        assertThat(groupWord.solution("aba"),is(false));
        assertThat(groupWord.solution("abcabc"),is(false));
    }
}
