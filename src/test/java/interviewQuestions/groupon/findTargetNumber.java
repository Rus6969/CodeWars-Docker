package interviewQuestions.groupon;

import java.util.Arrays;
import java.util.Hashtable;
/*
Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9.

The output should be [0, 1].
Because nums[0] + nums[1] = 2 + 7 = 9.
 */
public class findTargetNumber {

    static int[] targetSum(int[] nums,int targetNumber){
        /*
       You can use a HashMap to solve the problem in O(n) time complexity. Here are the steps:
Initialize an empty HashMap.
Iterate over the elements of the array.
For every element in the array -
If the element exists in the Map, then check if it’s complement (target - element)
also exists in the Map or not.
If the complement exists then return the indices of the current element and the complement.
Otherwise, put the element in the Map, and move to the next iteration.
         */
        Hashtable<Integer,Integer>map= new Hashtable<>();
        int arr []= new int [2];
        for (int i=0;i<nums.length;i++){
            int number=targetNumber-nums[i];
            if (map.containsKey(number)){
                arr[0]=i;
                arr[1]=map.get(number);
            }
            map.put(nums[i],i);

        }
        return arr;
    }
    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


    /*
    METHOD 3. Use Sorting along with the two-pointer approach
There is another approach which works when you need to return the numbers instead of their indexes. Here is how it works:

Sort the array.
Initialize two variables, one pointing to the beginning of the array (left) and another pointing to the end of the array (right).
Loop until left < right, and for each iteration
if arr[left] + arr[right] == target, then return the indices.
if arr[left] + arr[right] < target, increment the left index.
else, decrement the right index.
This approach is called the two-pointer approach. It is a very common pattern for solving array related problems.

Time complexity: O(n*log(n))
     */
    private static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int nums[]={2,7,15,11};
        int target=9;
        System.out.println(Arrays.toString(targetSum(nums,target)));
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**");
        System.out.println(Arrays.toString(findTwoSum_Sorting(nums,target)));

    }
}
