class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            if (map1.containsKey(t.charAt(i))) {
                int a = map1.get(t.charAt(i));
                a++;
                map1.put(t.charAt(i), a);
            } else {
                map1.put(t.charAt(i), 1);
            }
        }

        int left = 0;
        int match = 0;

        int bestLeft = 0;
        int bestLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            if (map2.containsKey(s.charAt(right))) {
                int a = map2.get(s.charAt(right));
                a++;
                map2.put(s.charAt(right), a);
            } else {
                map2.put(s.charAt(right), 1);
            }

            // Check if current character satisfies requirement
            if (map1.containsKey(s.charAt(right))) {
                if (map1.get(s.charAt(right)).equals(map2.get(s.charAt(right)))) {
                    match++;
                }
            }

            // Shrink window
            while (match == map1.size()) {

                if ((right - left + 1) < bestLength) {
                    bestLength = right - left + 1;
                    bestLeft = left;
                }

                int a = map2.get(s.charAt(left));
                a--;
                map2.put(s.charAt(left), a);

                if (map1.containsKey(s.charAt(left))) {
                    if (map2.get(s.charAt(left)) < map1.get(s.charAt(left))) {
                        match--;
                    }
                }

                left++;
            }
        }

        if (bestLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(bestLeft, bestLeft + bestLength);
    }
}