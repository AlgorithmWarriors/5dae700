package Chunghee.Level3;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class WordChangeTest {
    WordChange wordChange = new WordChange();
    @Test
    public void 단어변환테스트(){
        String[] words ={"hot", "dot", "dog", "lot", "log", "cog"};
        assertThat(wordChange.solution("hit","cog",words),is(4));
    }
    @Test
    public void 스트링에서다른거갯수세기테스트(){
        String[] words ={"hot", "dot", "dog", "lot", "log", "cog"};
        assertThat(wordChange.differentAlphatbetNumber("hit","cog"),is(3));
        assertThat(wordChange.differentAlphatbetNumber("hot","cog"),is(2));
    }
}
