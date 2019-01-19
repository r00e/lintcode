import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _50_ProductOfArrayExcludeItself {
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        int size = nums.size();

        if(size < 2){
            return Arrays.asList(1L);
        }

        List<Long> result = new ArrayList<>(Collections.nCopies(size, 1L));
        // 1   2  3  4 5
        // 120 60 20 5 1
        for(int i = size - 2; i >= 0; i--){
            result.set(i, Long.valueOf(nums.get(i+1)) * Long.valueOf(result.get(i+1)));
        }

        Long tmp = Long.valueOf(nums.get(0));
        for(int i = 1; i < size - 1; i++){
            result.set(i, tmp * result.get(i));
            tmp = tmp * nums.get(i);
        }
        result.set(size - 1, tmp);

        return result;
    }
}
