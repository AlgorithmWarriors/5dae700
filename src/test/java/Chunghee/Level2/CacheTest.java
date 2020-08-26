package Chunghee.Level2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class CacheTest {
    @Test
    public void 캐시테스트() {
        String[][] Citis = {
                {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"},
                {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"},
                {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"},
                {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"},
                {"Jeju", "Pangyo", "NewYork", "newyork"},
                {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}};
        int[] CacheSize = {3,3,2,5,2,0};
        int[] result = {50,21,60,52,16,25};
        Cache cache = new Cache();
        assertThat(cache.solution(CacheSize[1],Citis[1]),is(result[1]));
    }
}
