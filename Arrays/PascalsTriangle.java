import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        for(int i=1;i<=numRows;i++) {
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            if(i==1) {
            list1.add(list2);
            continue;
            }
            if(i>2) {
                for(int j=0;j<list1.get(list1.size()-1).size()-1;j++) {
                    int sum = list1.get(list1.size()-1).get(j)
                              + list1.get(list1.size()-1).get(j+1);
                    list2.add(sum);
                }
            }
            if(i>1) {
            list2.add(1);
            list1.add(list2);
            }

        }
        return list1;
    }
}