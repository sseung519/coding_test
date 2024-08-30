package week7;

public class Test {

    private static final int ANS = 17;

    public static void main(String[] args) {
        int left = 1; // 답으로 나올 수 있는 최소 값
        int right = 50; // 답으로 나올 수 있는 최대 값

        while(left < right) {
            System.out.println(left + " " + right);
            int mid = (left + right) / 2;
            if(isPossible(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("left = " + left);
    }

    private static boolean isPossible(int answer) {
        // 25 >= 17
        if (answer >= ANS) {
            return true;
        } else {
            return false;
        }
    }
}
