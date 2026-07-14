class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Step 1: Count student preferences
        int[] counts = new int[2];
        for (int student : students) {
            counts[student]++;
        }
        
        // Step 2: Match with the fixed sandwich stack
        for (int sandwich : sandwiches) {
            // If no student wants this sandwich, the line stops
            if (counts[sandwich] == 0) {
                break;
            }
            counts[sandwich]--;
        }
        
        // Step 3: Return the remaining count of hungry students
        return counts[0] + counts[1];
    }
}
