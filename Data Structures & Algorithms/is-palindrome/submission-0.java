class Solution {

    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || 
               (c >= 'A' && c <= 'Z') || 
               (c >= '0' && c <= '9');
    }

    public boolean isPalindrome(String s) {
        int leftSide = 0, rightSide = s.length() - 1;

        while (leftSide < rightSide) {
            char leftCharacter = s.charAt(leftSide);
            char rightCharacter = s.charAt(rightSide);

            if (!isAlphaNumeric(leftCharacter)) {
                leftSide++;
            } else if (!isAlphaNumeric(rightCharacter)) {
                rightSide--;
            } else if (Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter)) {
                return false;
            } else {
                leftSide++;
                rightSide--;
            }
        }

        return true;
    }
}