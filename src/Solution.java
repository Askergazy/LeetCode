public class Solution {

        public int scoreOfString(String s) {

            int answer = 0;

            for (int i = 0; i < s.length() - 1; i++) {
                int difference = Math.abs(s.charAt(i) - s.charAt(i + 1));
                answer += difference;
            }

            return answer;


    }
}
