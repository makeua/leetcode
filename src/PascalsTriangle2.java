import java.util.List;
import java.util.stream.IntStream;

public class PascalsTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        int[] row = new int[rowIndex];
        
        return IntStream.of(row).boxed().toList();
    }
}
