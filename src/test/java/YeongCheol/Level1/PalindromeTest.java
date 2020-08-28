package YeongCheol.Level1;

import YeongCheol.Level1.Palindrome;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void 회문테스트(){
        Palindrome palindrome = new Palindrome();
        assertThat(palindrome.JudgePalindrome("abba"), is(0));
        assertThat(palindrome.JudgePalindrome("summuus"), is(1));
        assertThat(palindrome.JudgePalindrome("xabba"), is(1));
        assertThat(palindrome.JudgePalindrome("abbax"), is(1));
       assertThat(palindrome.JudgePalindrome("comcom"), is(2));
    }
}
