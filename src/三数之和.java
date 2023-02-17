import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
    private static int[] nums = {-1,0,1,2,-1,-4};
//    private static int target = 2;
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int length = nums.length;
        if (length<3){
            return ;
        }
        Arrays.sort(nums);
        for (int first = 0;first< length;++first){
            if (first > 0 && nums[first]==nums[first-1]){
                continue;
            }
            int third = length-1;
            int target = -nums[first];
            for (int second = first+1;second<length;++second){
                if (second>first+1 && nums[second]==nums[second-1]){
                    continue;
                }
                while (second<third && nums[second]+nums[third]>target){
                    --third;
                }
                if (second==third){
                    break;
                }
                if (nums[second]+nums[third]==target){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        System.out.println(ans);
    }
}
