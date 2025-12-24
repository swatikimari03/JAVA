import java.util.HashMap;

public class HashMapExample02 {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 1, 3, 2, 1};

        HashMap<Integer, Integer> countMap = new HashMap<>();


        for ( int num : nums) {
            countMap.put(num , countMap.getOrDefault(num , 0) + 1);

        }

        System.out.println(countMap);
    }
}