package solutions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int [] nums){
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums [j]){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean containsDuplicateSet(int [] nums){
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])){
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().containsDuplicate(
                new int[]{1, 3, 4, 1}));

        System.out.println(new ContainsDuplicate().containsDuplicateSet(
                new int[]{1, 3, 4, 1}));
    }
}
