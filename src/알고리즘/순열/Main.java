
package 알고리즘.순열;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] elements = {1, 2, 3};
        List<List<Integer>> permutations = permute(elements);

        int cnt = 0;
        for (List<Integer> perm : permutations) {
            System.out.println(String.format("%2d",cnt++) + " > " + perm);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, 0, result);
        return result;
    }

    private static void permuteHelper(int[] nums, int index, List<List<Integer>> result) {
          if (index == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }
//        1,2,3
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            permuteHelper(nums, index + 1, result);
            swap(nums, index, i); // 다음 순열을 위해 다시 원래 위치로 되돌림
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
