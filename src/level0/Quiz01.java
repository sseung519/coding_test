package level0;

import java.util.Arrays;

/*
1. 공백으로 구분하기 1 - split() 함수 쓰기
문제 설명
단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
my_string은 영소문자와 공백으로만 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000
my_string의 맨 앞과 맨 뒤에 글자는 공백이 아닙니다.
 */
public class Quiz01 {
    public static void main(String[] args) {
        String my_string = "i love you";
        //split 구분자 공백으로 자르기
        String[] answer = my_string.split(" ");
        System.out.println(Arrays.toString(answer));
    }
}
