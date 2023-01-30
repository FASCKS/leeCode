package com.example.leecode.code;

import java.util.Arrays;

/**
 * https://github.com/youngyangyang04/leetcode-master/blob/master/problems/0070.%E7%88%AC%E6%A5%BC%E6%A2%AF.md
 */
public class problems_0070 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(climbStairs(10)));
    }

    public static int[]  climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i]=dp[i-1] + dp[i-2];
        }
        return dp;
    }
}

