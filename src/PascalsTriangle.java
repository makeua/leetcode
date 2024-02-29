import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        var s = new PascalsTriangle();
        System.out.println(s.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1, j; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            j = 1;
            for (; j < i - 1; j++) {
                row.add(list.get(i - 2).get(j - 1) + list.get(i - 2).get(j));
            }
            if (j < i) {
                row.add(1);
            }
            list.add(row);
        }
        return list;
    }
}
