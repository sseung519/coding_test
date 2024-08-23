package level0;
/*
 Q1. 아래와 같이 3x3 행렬이 2차원 배열로 초기화 되어있다.
//          모든 원소를 1로 변경하고, 대각 원소는 10으로 변경하시오.
        int [][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
 */

public class ArrayQuiz {
    public static void main(String[] args) {
        int [][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                testArray1[i][j] = 1;
                if(i == j) testArray1[i][j] = 10;
            }
        }
        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                System.out.print(testArray1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
