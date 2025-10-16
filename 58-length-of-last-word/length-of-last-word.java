class Solution {
    public int lengthOfLastWord(String s) {
        String[] group=s.split("\\s");
        return group[group.length-1].length();

        
    }
}