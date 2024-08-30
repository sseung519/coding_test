package week7;

/*
parametric search
https://school.programmers.co.kr/learn/courses/30/lessons/43238
 */

class Solution {
    private static final int MAX = 1_000_000_000;
    private static int N;
    private static int[] time;

    public long soultion(int n, int[] times) {
        N = n;
        time = times;
        long left = 1;
        long right = MAX * MAX;

        while(left < right) {
            long mid = (left + right) / 2;
            if(isPossible(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean isPossible(long answer) {
       long n = N;

        for (int i : time) {
            n -= answer / i;
        }

        return n <= 0;
    }
}
