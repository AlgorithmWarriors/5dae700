package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CamouflageTest {
    @Test
    public void 위장테스트(){
        String[][][] clothes = {{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}},
                {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}};
        int[] result ={5,3};
        Camouflage camouflage = new Camouflage();
        assertThat(camouflage.solution(clothes[0]),is(result[0]));
    }
}
