import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int scoreOfString(String s) {

        int answer = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int difference = Math.abs(s.charAt(i) - s.charAt(i + 1));
            answer += difference;
        }

        return answer;


    }

    public int findPermutationDifference(String s, String t) {


        Map<Character, Integer> nm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            nm.put(c, i);
        }
        Map<Character, Integer> kk = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            kk.put(c, i);
        }
        int ans = 0;
        for (char c : nm.keySet()) {
            ans = ans + Math.abs(nm.get(c) - kk.get(c));
        }
        return ans;
    }

    public double[] convertTemperature(double celsius) {
        double[]ans = new double[2];

        ans[0] =  celsius +  273.15;
        ans[1] = celsius * 1.80 + 32.00;



        return ans;


    }


}
