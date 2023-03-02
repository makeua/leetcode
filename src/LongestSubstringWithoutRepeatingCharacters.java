import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        int N = s.length();
        if (1 >= N) {
            return N;
        }
        int max = 1;
        char[] cs = s.toCharArray();
        Map<Character, Integer> pos = new HashMap<>();
        int j = 0;
        for (int i = 0; i < N; i++) {
            char ci = cs[i];
            if (pos.get(ci) != null) {
                j = Math.max(pos.get(ci) + 1, j);
            }
            pos.put(ci, i);
            max = Math.max(i - j + 1, max);
        }
        return max;
    }
}
