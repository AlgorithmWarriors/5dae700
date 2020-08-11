package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class Prime_number_FinderTest {
    @Test
    public void 소수찾기(){
        Prime_number_Finder prime_number_finder =new Prime_number_Finder();
        assertThat(prime_number_finder.solution("17"),is(3));
    }
}
