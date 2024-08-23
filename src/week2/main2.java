package week2;

import java.util.ArrayDeque;

// public String[] operations = {"Rotate", "ShiftRow"};
// public int[][] rc = {{1,2,3},{4,5,6},{7,8,9}};
class Solution1 {

    public int[][] solution(int[][] rc, String[] operations) {
        int[][] answer = new int[rc.length][rc[0].length];
        ArrayDeque<Integer> left = new ArrayDeque<>();
        ArrayDeque<Integer> right = new ArrayDeque<>();
        ArrayDeque<ArrayDeque<Integer>> middle = new ArrayDeque<>();

        for (int[] x : rc) {
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            for (int j = 0; j < x.length; j++) {
                if (j == 0) {
                    left.add(x[j]);
                } else if (j == x.length - 1) {
                    right.add(x[j]);
                } else {
                    deque.add(x[j]);
                }
                middle.add(deque);
            }
        }

            for (String operation : operations) {
                if (operation.equals("ShiftRow")) {
                    left.addFirst(left.pollLast());
                    middle.addFirst(middle.pollLast());
                    right.addFirst(right.pollLast());
                } else {
                    middle.peekFirst().addFirst(left.pollFirst());
                    right.addFirst(middle.peekFirst().pollLast());
                    middle.peekLast().addLast(right.pollLast());
                    left.addLast(middle.peekLast().pollFirst());
                }
            }
            for (int i = 0; i < rc.length; i++) {
                int j = 0;
                answer[i][j++] = left.pollFirst();
                ArrayDeque<Integer> d = middle.pollFirst();
                while (!d.isEmpty()) {
                    answer[i][j++] = d.pollFirst();
                }
                answer[i][j] = right.pollFirst();
            }

        return answer;
    }
}

