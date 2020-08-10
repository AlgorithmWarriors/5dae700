package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class BiggistSquareTest {
    @Test
    public void 가장큰정사각형찾기테스트(){
        int [][][]Boards = {{{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}},{{0,0,1,1},{1,1,1,1}}};
        int []ansewrs = {9,4};
        BiggistSquare biggistSquare = new BiggistSquare();
        for(int i=0;i<1;i++){
            assertThat(biggistSquare.solution(Boards[i]),is(ansewrs[i]));
        }
    }
}
