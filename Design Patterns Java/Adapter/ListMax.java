import java.util.List;

public class ListMax {


    public int getMaxFromList(List<Integer> numbers) {
        int max = 0;
        for (int n: numbers){
            if (n > max){
                max = n;
            }
        }
        return max;
    }
}
