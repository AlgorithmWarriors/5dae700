package Chunghee.Level3;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TravelRouteTest {
    @Test
    public void 여행경로(){
        String[][] ticket ={{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        TravelRoute travelRoute = new TravelRoute();
        assertThat(travelRoute.solution(ticket),is(new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"}));
    }
}
