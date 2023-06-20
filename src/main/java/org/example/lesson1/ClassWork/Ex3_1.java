package org.example.lesson1.ClassWork;

public class Ex3_1 {
    public static void main(String[] args) {
//        Дан массив nums.
//        Мы определяем текущую сумму массива как  runningSum[i] = sum(nums[0]…nums[i]).
//        Вернуть текущую сумму nums.
        int[] arr = {1,2,3,4};
        int[] res = runningSum(arr);

        for (int n : res) {
            System.out.print(n +", ");
        }
    }

    /**
     * @apiNote Дан массив nums. Мы определяем текущую сумму массива как  runningSum[i] = sum(nums[0]…nums[i]).
     * @param nums
     * @return итоговый массив сумм
     */

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
