public class ReverseWordsInString3 {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        StringBuilder ans = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                if (!first) {
                    ans.append(' ');
                }
                ans.append(sb.reverse());
                sb.setLength(0);
                first = false;
            } else {
                sb.append(c);
            }
        }
        if (sb.length() > 0) {
            if (!first) {
                ans.append(' ');
            }
            ans.append(sb.reverse());
        }
        return ans.toString();
    }
}
