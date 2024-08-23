package week4;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/42746
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {

}
class Solution {
    public String solution(int[] numbers) {
        ArrayList<String> list = new ArrayList<>();
        for( int number : numbers) {
            list.add(String.valueOf(number)); //numbers 배열을 String으로 만들어 표현 가능하게 하기
        }
        Collections.sort(list, (o1, o2) -> { //ArrayList는 Collection이기 때문에 Collectios.sort이용
            int a = Integer.parseInt(o1 + o2);
            int b = Integer.parseInt(o2 + o1);
            return Integer.compare(b, a); //합쳤을때 가장 큰 숫자 만들게 하기위해 내림차순 정렬
        });
        //StringBuilder를 사용하는 이유 String은 불변객체이기 때문에 ex) String객체 s+= 을 사용하면 새로운 배열을 만들고 기존에 있던
        //String 배열을 하나하나 복사해서 넣고 추가될 것을 넣어서 새로운 객체로 생성한다. 그렇기 때문에 시간복잡도에서 오래걸림
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        if(sb.charAt(0) == '0') return "0"; //맨 앞에가 0이면 그 없는 없는 숫자?

        return sb.toString();
    }
}
