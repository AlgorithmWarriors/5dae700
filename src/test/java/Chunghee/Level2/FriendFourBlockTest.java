package Chunghee.Level2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class FriendFourBlockTest {
    @Test
    public void 프렌즈4블럭(){
        int[] m = {4,6};
        int[] n = {5,6};
        String[][] board ={{"CCBDE", "AAADE", "AAABF", "CCBBF"}
                          ,{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}};
        int[] answer = {14,15};
        FriendFourBlock friendFourBlock = new FriendFourBlock();
        assertThat(friendFourBlock.solution(m[0],n[0],board[0]),is(14));
    }
}
