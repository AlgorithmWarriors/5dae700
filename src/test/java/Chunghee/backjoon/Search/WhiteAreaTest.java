package Chunghee.backjoon.Search;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class WhiteAreaTest {
    String ChessBoard[][] =
            {{".","F",".","F",".",".",".","F"},
             {"F",".",".",".","F",".","F","."},
             {".",".",".","F",".","F",".","F"},
             {"F",".","F",".",".",".","F","."},
             {".","F",".",".",".","F",".","."},
             {"F",".",".",".","F",".","F","."},
             {".","F",".","F",".","F",".","F"},
             {".",".","F","F",".",".","F","."}};
    @Test
    public void 하얀칸기물수테스트(){
        WhiteArea whiteArea =new WhiteArea();
        assertThat(whiteArea.solution(ChessBoard),is(1));
    }
}
