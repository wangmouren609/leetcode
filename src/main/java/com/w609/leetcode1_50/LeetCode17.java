package com.w609.leetcode1_50;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LeetCode17 {

    public char[][] chars = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            if (i == 0) {
                for (char c : chars[(int) digits.charAt(0) - 50]) {
                    result.add(String.valueOf(c));
                }
            } else {
                List<String> temp = new ArrayList<>();
                for (String s : result) {
                    for (char c : chars[(int) digits.charAt(i) - 50]) {
                        temp.add(s + c);
                    }
                }
                result = temp;
            }
        }

        return result;
    }

}

