package Chunghee.Level2;

import java.util.Arrays;
import java.util.Stack;

public class SkillTree {

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i<skill_trees.length;i++)
        {
            answer += CheckSkillTree(skill,skill_trees[i]);
        }

        return answer;
    }

    private int CheckSkillTree(String skill, String skill_tree) {

        int[] rank = new int[skill.length()];
        char[] skillchar = skill.toCharArray();
        Arrays.fill(rank,100);
        for (int i = 0; i <skillchar.length;i++){
            for (int j = 0; j < skill_tree.length(); j++) {
                if(skill_tree.charAt(j)==skillchar[i])rank[i]=j;
            }
        }
        for(int i=0;i<rank.length-1;i++){
            if(rank[i]>rank[i+1])return 0;
        }

        return 1;
    }

}
