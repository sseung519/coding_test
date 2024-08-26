package week5;

/*
디펜스 게임
https://school.programmers.co.kr/learn/courses/30/lessons/142085
 */

import java.util.Collections;
import java.util.PriorityQueue;



public class Quiz3 {

}

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        // Collections.reverseOrder()이 생각이 안날땐 add할때 -로 넣고 꺼낼때 -로 꺼낸다.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int e : enemy) {
            // pq.add(-e); //-로 add
            // 우선순위에 iteral e를 넣고
            pq.add(e);
            //k가 0보다 크고 병사가 e보다 작으면 pq에 등록한 제일 큰 e를 가져와서 병사에 더해주고 k차감
            if(k > 0 && n < e) {
                // n += -pq.poll(); //-로 poll
                n += pq.poll();
                k--;
            }
            //n이 e보다 크면 그냥 n에서 e를 빼고
            n -= e;
            if(n < 0) break; //n이 0보다 작으면 멈춘다
            answer++;
        }

        return answer;
    }

}


/*
int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(n);
        int s = 0;
        int x = 0;
        s += pq.poll();
        for (int i = 0; i < enemy[i].length; i++) {
            if (enemy[i].length <= pq.size()) {
                x = pq.size() - enemy.length;
                pq.add(x);
            } else {

            }
        }
        return answer;
 */