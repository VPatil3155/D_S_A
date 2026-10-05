class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // The array contains elements from 0 to n-1, plus 2 duplicates.
        // Therefore, the maximum unique number possible is nums.length - 3.
        int maxPossibleValue = nums.length - 2;
        int[] counts = new int[maxPossibleValue];
        
        int[] sneaky = new int[2];
        int index = 0;
        
        for (int num : nums) {
            counts[num]++;
            if (counts[num] == 2) {
                sneaky[index++] = num;
                // Once we have found both sneaky numbers, we can stop immediately
                if (index == 2) {
                    break;
                }
            }
        }
        
        return sneaky;
    }
}
