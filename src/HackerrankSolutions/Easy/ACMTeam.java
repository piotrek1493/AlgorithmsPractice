package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/acm-icpc-team/problem
 */

import java.util.Arrays;

public class ACMTeam {
    static int[] acmTeam(String[] topic) {
        int maxSkills = 0;
        int maxSkillTeams = 0;

        for(int i = 0; i < topic.length; i++) {
            for(int j = i + 1; j < topic.length; j++) {
                int skillSet = 0;
                for(int k = 0; k < topic[i].length(); k++) {
                    if(topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1') {
                        skillSet++;
                    }
                }
                if(maxSkills == skillSet) {
                    maxSkillTeams += 1;
                }
                if(skillSet > maxSkills) {
                    maxSkillTeams = 1;
                    maxSkills = skillSet;
                }
            }
        }
        return new int[]{maxSkills, maxSkillTeams};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(acmTeam(new String[]{"10101", "11100", "11010", "00101"})));
    }

}
