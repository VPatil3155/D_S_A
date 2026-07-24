import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // Step 1: Extract unique numbers to reduce redundant operations
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }
        
        // Convert set to array for index-based access
        int[] uniqueNums = new int[uniqueSet.size()];
        int idx = 0;
        for (int num : uniqueSet) {
            uniqueNums[idx++] = num;
        }
        int n = uniqueNums.length;
        
        // Step 2: Compute all possible pair XOR values (A ^ B)
        Set<Integer> pairXors = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairXors.add(uniqueNums[i] ^ uniqueNums[j]);
            }
        }
        
        // Step 3: Combine pair XORs with the third element (Pair_XOR ^ C)
        Set<Integer> tripletXors = new HashSet<>();
        for (int pXor : pairXors) {
            for (int num : uniqueNums) {
                tripletXors.add(pXor ^ num);
            }
        }
        
        // Step 4: Return total unique values
        return tripletXors.size();
    }
}
