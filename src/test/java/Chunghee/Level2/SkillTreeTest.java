package Chunghee.Level2;

import Chunghee.SkillTree;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class SkillTreeTest {
    @Test
    public void 스킬트리테스트(){
        Chunghee.SkillTree skillTree = new SkillTree();
        String[] myString1 = {"BACDE", "CBADF", "AECB", "BDA"};
        String[] myString2 = {"AB", "BA"};
        assertThat(skillTree.solution("CBD",myString1),is(2));
        assertThat(skillTree.solution("AB",myString2),is(1));

    }

}
