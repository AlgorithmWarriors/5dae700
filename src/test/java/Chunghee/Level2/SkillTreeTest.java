package Chunghee.Level2;

import Chunghee.SkillTree;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class SkillTreeTest {
    @Test
    public void 스킬트리테스트(){
        Chunghee.SkillTree skillTree = new SkillTree();
        String[] myString1 = {"AB", "BA","CDEAFG","DCNSWUEO"};
        String[] myString2 = {"AB", "BAC"};
        String[] myString3 = {"AB", "BACD"};
        assertThat(skillTree.solution("Q",myString1),is(4));
        assertThat(skillTree.solution("A",myString2),is(2));
        assertThat(skillTree.solution("b",myString3),is(2));
    }

}
