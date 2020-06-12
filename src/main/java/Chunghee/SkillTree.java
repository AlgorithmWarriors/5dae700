package Chunghee;

import java.util.Stack;

public class SkillTree {

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0; i<skill_trees.length;i++)
        {
            answer = answer+CheckSkillTree(skill,skill_trees[i]);
        }

        return answer;
    }

    private int CheckSkillTree(String skill, String skill_tree) {

        int targetindex = skill_tree.length()-1;
        Stack<Character> myStack = new Stack<Character>();
        for(int i=skill.length()-1;i>=0;i--){
            for(int j=targetindex;j>=0;j--) {
                if (skill_tree.charAt(j) == skill.charAt(i)) {
                    myStack.push(skill_tree.charAt(j));
                    targetindex = j-1;
                    break;
                }
            }
        }
        if(myStack.isEmpty())return 1;
        if(myStack.peek()==skill.charAt(0)) return 1;
        else return 0;
    }

}
