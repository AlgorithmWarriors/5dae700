package Chunghee.backjoon.Search;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class MovieDirectorShoumTest {
    @Test
    public void 무비디렉터숀테스트(){
        MovieDirectorShoum movieDirectorShoum =new MovieDirectorShoum();
        assertThat(movieDirectorShoum.solution(2),is(1666));
    }
}
