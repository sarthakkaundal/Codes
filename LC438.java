// Approach 
// If s.length < p.length, return an empty list
// Create a frequency array of size 26 for string p
// Use a sliding window of size p.length on string s
// At each step:
// add the right character to the window frequency
// remove the left character when window size exceeds
// When window size matches and
// window frequency == pattern frequency, an anagram is found, so add the starting index
// Return the list
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length() < p.length()){
            return list;
        }

        int[] freqP = new int[26];
        int[] freqW = new int[26];

        for(char c : p.toCharArray()){
            freqP[c - 'a']++;
        }

        int k = p.length() ;

        for(int i=0; i<s.length(); i++){

            freqW[s.charAt(i) - 'a']++;

            if( i >= k){
                freqW[s.charAt(i-k) - 'a']--;
            }

            if( i >= k-1 && Arrays.equals(freqP, freqW)){
                list.add(i-k+1);
            }
        }
    return list;
    }
}