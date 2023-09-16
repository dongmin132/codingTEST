class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String word : skill_trees) {
            String tempSkill = word;
            for (int i = 0; i < word.length(); i++) {
                String s = Character.toString(word.charAt(i));
                if (!skill.contains(s))
                    tempSkill=tempSkill.replaceAll(s, "");
            }
            System.out.println(tempSkill);
            if (skill.indexOf(tempSkill)==0) {
                answer++;
            }
        }
        return answer;
    }
}