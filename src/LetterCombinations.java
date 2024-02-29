import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return List.of();
        }
        var comb = new ArrayList<String>();
        go(0, digits.toCharArray(), new StringBuilder(), comb);
        return comb;
    }

    static final Map<Character, String> map = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    static void go(int i, char[] array, StringBuilder sb, List<String> comb) {
        if (i >= array.length) {
            comb.add(sb.toString());
            return;
        }
        char a = array[i];
        for (var v : map.get(a).toCharArray()) {
            sb.append(v);
            go(i + 1, array, sb, comb);
            sb.setLength(sb.length() - 1);
        }
    }
}
