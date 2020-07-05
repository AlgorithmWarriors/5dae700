package YeongCheol.Level1;

import YeongCheol.Level1.PrivateMap;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrivateMapTest {
    @Test
    public void 비밀지도(){
        PrivateMap privateMap = new PrivateMap();
        assertThat(privateMap.solution(5, new int[]{9,20,28,18,11}, new int[]{30,1,21,17,28}),
                is(new String[]{"#####","# # #", "### #", "#  ##", "#####"}));
        /*
        assertThat(privateMap.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10}),
                is(new String[]{"######", "### #", "## ##", " #### ", " #####", "### # "}));
        */
        assertThat(privateMap.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10}),
                is(new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "}));
    }
}
