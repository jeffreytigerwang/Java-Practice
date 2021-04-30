import java.util.Arrays;
import java.util.IntSummaryStatistics;

class Solution {
    public int maxProduct(int[] nums) {
        IntSummaryStatistics stat = Arrays.stream(nums).summaryStatistics();
        int res = stat.getMax();
        int Cmax = 1;
        int Cmin = 1;
        int temp = 0;
        for (int i : nums){
            if (i == 0){
                Cmax = 1;
                Cmin = 1;
                continue;
            }
            temp = Cmax;
            Cmax = Math.max(Math.max(temp*i, Cmin*i), i);
            Cmin = Math.min(Math.min(temp*i, Cmin*i), i);
            res = Math.max(Cmax, res);
        }
        return res;
    }
}

public class max_product_subarray {
    public static void main(String[] arg){
        int[] nums = {1,2,3,4,5};
        Solution test1 = new Solution();
        System.out.println(test1.maxProduct(nums));

    }
}
