package level0;

import java.util.*;

/*
문제 설명
문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 제한사항
0 < s의 길이 < 1,000
s는 소문자로만 이루어져 있습니다.
입출력 예
s	result
"abcabcadc"	"d"
"abdc"	"abcd"
"hello"	"eho"
 */
public class Quiz08 {
    public static void main(String[] args) {
        String str = "abcabcadc";
        Map<Character, Integer> map = new HashMap<>();
        for ( char c : str.toCharArray() ) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<String> list = new ArrayList<>();




    }
}
