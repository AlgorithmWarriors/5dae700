package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class ShiritoriTest {
    @Test
    public void 끝말잇기테스트(){
        String[][] strings =
                        {{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"},
                        {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"},
                        {"hello", "one", "even", "never", "now", "world", "draw"},
                        {"land", "dream", "mom", "mom", "ror"},
                        {"land", "dream", "mom", "mom"}};
        int[] number={3,5,2,2,2};
        int[][] result ={{3,3},{0,0},{1,3},{2,2},{2,2}};
        Shiritori shiritori = new Shiritori();
        for(int i =0;i<strings.length;i++) {
            assertThat(shiritori.solution(number[0], strings[0]), is(result[0]));
        }
    }
}
