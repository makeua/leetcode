import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1map = buildCharMap(s1);
        Map<Character, Integer> s2map = buildCharMap(s2);

        return false;
    }

    static Map<Character, Integer> buildCharMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
