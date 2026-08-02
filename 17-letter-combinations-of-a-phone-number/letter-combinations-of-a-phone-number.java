import java.util.*;

class Solution {

    List<String> result = new ArrayList<>();

    String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return result;
        }

        backtrack(digits, 0, "");

        return result;
    }

    public void backtrack(String digits, int index, String current) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            backtrack(digits, index + 1, current + letters.charAt(i));
        }
    }
}