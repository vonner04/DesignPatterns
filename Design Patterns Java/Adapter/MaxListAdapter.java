import java.util.List;
import java.util.ArrayList;

public class MaxListAdapter implements Max {
    private ListMax listMax;

    public MaxListAdapter(ListMax listMax){
        this.listMax = listMax;
    }

    @Override 
    public int getMax(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int n: numbers){
            list.add(n);
        }
        return listMax.getMaxFromList(list);
    }
}
