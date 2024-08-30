package week5;

import java.util.PriorityQueue;

public class Quiz4 {
}
class Solution1 {
    public int solution(int[] stones, int k) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int stone : stones) {
            pq.add(stone);

        }
        return answer;
    }
}